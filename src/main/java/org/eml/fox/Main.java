package org.eml.fox;

import org.eml.fox.JUI.LoginFrame;
import org.eml.fox.JUI.MainFrame;

/**
 * @author liangcha_hh
 * @author xiaoxing
 * @since 1.0
 *
 * Ender Minecraft Launcher
 *     Copyright (C) 2023
 *
 *     liangcha_hh <2323998240@qq.com>
 *     linmu13ak <linmu013@163.com|3590327847>
 *     xiaoxing <645710596@qq.com>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your function) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello EnderMinecraftLauncher!");
        //new LoginFrame();
        new MainFrame();
    }
}