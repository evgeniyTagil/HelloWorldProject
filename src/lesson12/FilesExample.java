package lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\.idea");
        File file2 = new File("out2");
        String str = "hello \"world\"";    //    что бы написать кавычки
        System.out.println(str);
        System.out.println(file.exists()); // есть ли такой файл
        System.out.println(file.isFile()); // этот эл-нт это файл?
        System.out.println(file2.isDirectory()); // папка ли это?
        file2.mkdir(); // создать папку с именем файла 2
        System.out.println(file.isHidden()); // скрытый ли файл?
        try {
            System.out.println("....................................");
            System.out.println(file.createNewFile()); // создаёт файл abc.doc в корне
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getUsableSpace());
            System.out.println(file.renameTo(new File("abc4.doc")));
            System.out.println(file.setReadOnly());
            System.out.println(file.setReadable(true));
            System.out.println(file.setWritable(false));
            System.out.println(file.lastModified());

        } catch (IOException e) {
            System.out.println("File is not created by reason:" + e);
        }
        System.out.println(file.delete());
        System.out.println(file2.getAbsolutePath()); // абсолютный путь
        System.out.println(file.getCanonicalPath()); // каноничный путь
        System.out.println(file.getParent()); // указать папку выше

        File file3 = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject");
        System.out.println(Arrays.toString(file3.list())); // только названия
        System.out.println(Arrays.toString(file3.listFiles())); // путь и название
        System.out.println(Arrays.toString(file3.listFiles(new DocFilter()))); // путь и название + фильтр .doc


    }

}
