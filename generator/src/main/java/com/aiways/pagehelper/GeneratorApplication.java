package com.aiways.pagehelper;


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
        configurationParam.setJavaFileTatgetPackage("com.aiways.pagehelper.temp");
        configurationParam.setJavaFileTatgetProject("pagehelper/src/main/java");
        configurationParam.setMapperFileTatgetPackage("com.aiways.pagehelper.temp");
        configurationParam.setMapperFileTatgetProject("pagehelper/src/main/java");
        configurationParam.setMapperFileType("XMLMAPPER");
        configurationParam.setXmlFileTatgetPackage("com.aiways.pagehelper.temp");
        configurationParam.setXmlFileTatgetProject("pagehelper/src/main/java");
        configurationParam.setTableName("t_voice_note_store");
        configurationParam.setPoName("btkeyDetailRecordPo");
        configurationParam.setAuthor("maq");

        // 修改标记
        ShellRunner shellRunner = new ShellRunner();
        shellRunner.run(configurationParam);
    }
}
