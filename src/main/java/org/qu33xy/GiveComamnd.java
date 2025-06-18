package org.qu33xy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveComamnd implements CommandExecutor {
    String pluginName = ChatColor.translateAlternateColorCodes('&', "&6&lFarmer&f&lPlugin");


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.isOp()) {
            sender.sendMessage(pluginName + " Nie masz uprawnien do tej komendy!");
            return true;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage(pluginName + " Tylko gracz moze uzyc tej komendy!");
            return true;
        }
        Player player = (Player) sender;

        switch (label.toLowerCase()) {
            case "boyfarmer":
                player.getInventory().addItem(Main.boyFarmer);
                player.sendMessage(pluginName + " Dostales przedmiot: " + Main.boyFarmer.getItemMeta().getDisplayName());
                break;
            case "sandfarmer":
                player.getInventory().addItem(Main.sandFarmer);
                player.sendMessage(pluginName + " Dostales przedmiot: " + Main.sandFarmer.getItemMeta().getDisplayName());
                break;
            case "kopaczfosy":
                player.getInventory().addItem(Main.kopaczFosy);
                player.sendMessage(pluginName + " Dostales przedmiot: " + Main.kopaczFosy.getItemMeta().getDisplayName());
                break;
            default:
                player.sendMessage(pluginName + " Nieznana komenda!");
        }

        return true;
    }
}
