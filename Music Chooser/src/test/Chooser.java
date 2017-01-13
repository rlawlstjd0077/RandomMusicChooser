package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by GSD on 2017-01-12.
 */
public class Chooser {
    private ArrayList<String> musicList;
    private File file;
    public Chooser() throws IOException {
        File temp = new File("");

        String path = temp.getCanonicalPath();
        file = new File(path + "MusicList.txt");
    }

    public String chooseMusic(){
        Random ran = new Random();
        return musicList.get(ran.nextInt((musicList.size() - 1)));
    }

    public void doScan(){
        BufferedReader br = null;
        musicList = new ArrayList<>();
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
            String line;
            while((line = br.readLine()) != null){
                musicList.add(line.split("\t")[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
