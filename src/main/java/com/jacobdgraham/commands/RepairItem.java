package com.jacobdgraham.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RepairItem implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack item_in_hand = player.getInventory().getItemInMainHand();
            ItemMeta item_in_hand_meta_data = item_in_hand.getItemMeta();

            if (item_in_hand_meta_data instanceof Damageable) {
                ItemStack duplicate_of_current_item = new ItemStack(item_in_hand.getType());
                player.getInventory().setItemInMainHand(duplicate_of_current_item);
                return true;
            }
        }
        return false;
    }
}
