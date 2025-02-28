import java.io.*;


public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        File src = new File("D://Games//src");
        if (src.mkdir()) {
            stringBuilder.append("directory src was created\n");
        } else stringBuilder.append("directory src was not created\n");

        File res = new File("D://Games//res");
        if (res.mkdir()) {
            stringBuilder.append("directory res was created\n");
        } else stringBuilder.append("directory res was not created\n");

        File savegames = new File("D://Games//savegames");
        if (savegames.mkdir()) {
            stringBuilder.append("directory savegames was created\n");
        } else stringBuilder.append("directory savegames was not created\n");

        File temp = new File("D://Games//temp");
        if (temp.mkdir()) {
            stringBuilder.append("directory temp was created\n");
        } else stringBuilder.append("directory temp was not created\n");

        File main = new File("D://Games//src//main");
        if (main.mkdir()) {
            stringBuilder.append("directory main was created\n");
        } else stringBuilder.append("directory main was not created\n");

        File test = new File("D://Games//src//test");
        if (test.mkdir()) {
            stringBuilder.append("directory test was created\n");
        } else stringBuilder.append("directory test was not created\n");

        File Main_java = new File("D://Games//src//main//Main.java");
        try {
            if (Main_java.createNewFile())
                stringBuilder.append("file Main.java was created\n");
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
            stringBuilder.append("\n");
        }

        File Utils_java = new File("D://Games//src//main//Utils.java");
        try {
            if (Utils_java.createNewFile())
                stringBuilder.append("file Utils.java was created\n");
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
            stringBuilder.append("\n");
        }
        File drawables = new File("D://Games//res//drawables");
        if (drawables.mkdir()) {
            stringBuilder.append("directory drawables was Created\n");
        } else stringBuilder.append("directory drawables was not created\n");

        File vectors = new File("D://Games//res//vectors");
        if (vectors.mkdir()) {
            stringBuilder.append("directory vectors was created\n");
        } else stringBuilder.append("directory was not created\n");

        File icons = new File("D://Games//res//icons");
        if (icons.mkdir()) {
            stringBuilder.append("directory icons was created\n");
        } else stringBuilder.append("directory was not created\n");

        File temp_txt = new File("D://Games//temp//temp.txt");
        try {
            if (temp_txt.createNewFile())
                stringBuilder.append("file temp.txt was created");
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
            stringBuilder.append(" file temp.txt was not created\n");
        }

        String s = stringBuilder.toString();

        try (FileWriter writer = new FileWriter("D://Games//temp//temp.txt")) {
            writer.write(s);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


// src, res, savegames, temp;  res//drawables, vectors, icons;   temp//temp.txt