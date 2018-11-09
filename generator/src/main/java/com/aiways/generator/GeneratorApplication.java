package com.aiways.generator;


import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.dto.ConfigurationParam;

/**
 * @Author maq
 * @Date 2018年9月7日
 */
public class GeneratorApplication {
    /**
     * 配置文件地址
     **/
    public static void main(String[] args) {

        ConfigurationParam configurationParam = new ConfigurationParam();
        configurationParam.setConnectionUrl("jdbc:mysql://172.19.1.112:3306/aiways-hu?characterEncoding=utf8&amp;useSSL=true");
        configurationParam.setDriveClass("com.mysql.jdbc.Driver");
        configurationParam.setDatabaseUserId("root");
        configurationParam.setDatabasePassword("root");
        configurationParam.setJavaFileTatgetPackage("com.aiways.generator.temp");
        configurationParam.setJavaFileTatgetProject("generator/src/main/java");
        configurationParam.setMapperFileTatgetPackage("com.aiways.generator.temp");
        configurationParam.setMapperFileTatgetProject("generator/src/main/java");
        configurationParam.setMapperFileType("XMLMAPPER");
        configurationParam.setXmlFileTatgetPackage("com.aiways.generator.temp");
        configurationParam.setXmlFileTatgetProject("generator/src/main/java");
        configurationParam.setTableName("t_voice_note_store");
        configurationParam.setPoName("btkeyDetailRecordPo");
        configurationParam.setAuthor("maq");

        ShellRunner shellRunner = new ShellRunner();
        shellRunner.run(configurationParam);
    }
}
