import org.eml.fox.files.Log.LogUtils;
import org.eml.fox.files.PropertiesUtils;

import java.io.File;
import java.util.Objects;

public class Test {
    @org.junit.jupiter.api.Test
    public void testDir() {
        System.out.println(PropertiesUtils.getDir());
    }

    @org.junit.jupiter.api.Test
    public void testCopy(){
        File source = new File("src/main/resources/user.properties");
        File target = new File(PropertiesUtils.getDir());
        PropertiesUtils.copy(source,target);
    }

    @org.junit.jupiter.api.Test
    public void testLoadProperties(){
        LogUtils.updateProperties("1","1");
    }
}
