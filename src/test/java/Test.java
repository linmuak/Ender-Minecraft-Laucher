import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eml.fox.files.Log.LogUtils;
import org.eml.fox.files.PropertiesUtils;
import org.junit.platform.commons.logging.LoggerFactory;

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

    @org.junit.jupiter.api.Test
    public void testLog4j(){
        Logger logger = LogManager.getLogger(Test.class);
        logger.info(1);
    }

    @org.junit.jupiter.api.Test
    public void testMKDIR(){
        LogUtils.createDir();
    }
}
