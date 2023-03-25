package org.eml.fox;

import org.eml.fox.JUI.MainFrame;
import org.eml.fox.files.Log.Logger;
import org.eml.fox.files.PropertiesUtils;

import java.io.File;

/**
 * @author liangcha_hh
 * @author xiaoxing
 * @author 北瓜sakura
 *
 *<p>
 * Ender Minecraft Launcher
 *     Copyright (C) 2023
 *
 *     liangcha_hh <2323998240@qq.com>
 *     linmu13ak <linmu013@163.com|3590327847@qq.com>
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
 *     along with this program.  If not, see <a href="https://www.gnu.org/licenses/">...</a>.
 *     </p>
 */
public class Main {
    public static String USER_DIR = PropertiesUtils.getDir();
    public static String USER_STORE = USER_DIR+"\\EML";
    public static void main(String[] args) {
        System.out.println("Hello EnderMinecraftLauncher!");
        //new LoginFrame();
        new MainFrame();
        File user_properties_source = new File("src/main/resources/user.properties");
        File user_properties_target = new File(USER_DIR);
        PropertiesUtils.copy(user_properties_source,user_properties_target);
        PropertiesUtils.updateProperties("user.properties","USER_DIR",USER_DIR);
        Logger.logger.error(1);
    }
}