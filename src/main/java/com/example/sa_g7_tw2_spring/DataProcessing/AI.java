package com.example.sa_g7_tw2_spring.DataProcessing;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AI {

    public boolean Analyze(double[] data){
        File processPythonFile = new File("src/py/ai.py");
        boolean result = ScriptRunner.runScript((BufferedReader br) -> {
            List<String> lines = br.lines().toList();
            try {
                return Boolean.valueOf(lines.get(lines.size() - 1));
            } catch (Exception e) { }
            return true;
        },"py",processPythonFile.getAbsolutePath(), String.join(" ", Arrays.stream(data).mapToObj(d->String.valueOf(d)).collect(Collectors.toList())));
        return result;
    }
}
