package org.qu33xy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveComamnd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Ta komenda jest tylko dla graczy!");
            return true;
        }
        if (!sender.isOp()) {
            sender.sendMessage("Nie masz uprawnien!");
            return true;
        }
        Player player = (Player) sender;

        switch (label.toLowerCase()) {
            case "boyfarmer":
                player.getInventory().addItem(Main.boyFarmer);
                player.sendMessage("Dostales przedmiot: " + Main.boyFarmer.getItemMeta().getDisplayName());
                break;
            case "sandfarmer":
                player.getInventory().addItem(Main.sandFarmer);
                player.sendMessage("Dostales przedmiot: " + Main.sandFarmer.getItemMeta().getDisplayName());
                break;
            case "kopaczfosy":
                player.getInventory().addItem(Main.kopaczFosy);
                player.sendMessage("Dostales przedmiot: " + Main.kopaczFosy.getItemMeta().getDisplayName());
                break;
            default:
                player.sendMessage("Nieznana komenda!");
        }

        return true;
    }
}
