import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //a
        File mainPath = new File("C:\\Users\\User\\Desktop\\7семестр\\програмування\\lab3\\lab3_movies");

        File dir1 = new File(mainPath + "\\Drama"); //1
        dir1.mkdir();
        File dir2 = new File(mainPath + "\\Comedy"); //2
        dir2.mkdir();


        //directory 1
        File dir1_1 = new File(mainPath + "\\Drama\\The King"); //1.1
        dir1_1.mkdir();
        File dir1_2 = new File(mainPath + "\\Drama\\The Irishman"); //1.2
        dir1_2.mkdir();
        File dir1_3 = new File(mainPath + "\\Drama\\The Big short"); //1.3
        dir1_3.mkdir();

        //directory 2
        File dir2_1 = new File(dir2 + "\\Notting Hill"); //2.1
        dir2_1.mkdir();
        File dir2_2 = new File(dir2 + "\\Over Board"); //2.2
        dir2_2.mkdir();

        //directory 2.1
        File dir2_1_1 = new File(dir2_1 + "\\Julia Roberts"); //2.1.1
        dir2_1_1.mkdir();
        File dir2_1_2 = new File(dir2_1 + "\\Hugh Grant"); //2.1.2
        dir2_1_2.mkdir();

        //directory 2.1.1
        File dir2_1_1_1 = new File(dir2_1_1 + "\\Rate8"); //2.1.1.1
        dir2_1_1_1.mkdir();

        //directory 2.1.2
        File dir2_1_2_1 = new File(dir2_1_2 + "\\Rate9"); //2.1.2.1
        dir2_1_2_1.mkdir();


        //directory 2.2
        File dir2_2_1 = new File(dir2_2 + "\\Anna Faris"); //2.2.1
        dir2_2_1.mkdir();
        File dir2_2_2 = new File(dir2_2 + "\\Eva Longoria"); //2.2.2
        dir2_2_2.mkdir();

        //б
        File path1 = new File(".\\lab3_movies");  //відносний шлях до папки lab3_movies

        File pathToDir2_1_1_1 = new File(path1 + "\\Drama\\The Irishman\\..\\..\\Comedy\\Notting Hill\\Hugh Grant\\..\\..\\Over Board\\..\\..\\Drama\\..\\Comedy\\Over Board\\Eva Longoria\\..\\..\\Notting Hill\\Hugh Grant\\Rate9\\..\\..\\Julia Roberts\\Rate8");
        File file1= new File(pathToDir2_1_1_1 + "\\rateFromFirstWorkYear.txt");
        file1.createNewFile();
        File file2= new File(pathToDir2_1_1_1 + "\\rateFromSecondWorkYear.txt");
        file2.createNewFile();
        File file3= new File(pathToDir2_1_1_1 + "\\rateFromThirdWorkYear.txt");
        file3.createNewFile();


        //в
        File pathToDir1_3 = new File (pathToDir2_1_1_1 + "\\..\\..\\Hugh Grant\\..\\..\\..\\Drama\\The King\\..\\The Big short");

        File file4 = new File(pathToDir1_3 + "\\Christian Bale.txt");
        file4.createNewFile();
        File file5 = new File(pathToDir1_3 + "\\Marisa Tomei.txt");
        file5.createNewFile();

        //г
        File pathToDir2_2_2 = new File(pathToDir1_3 + "\\..\\..\\Drama\\The King\\..\\..\\Comedy\\Notting Hill\\Julia Robert\\..\\..\\Over Board\\Eva Longoria");
        File file6 = new File(pathToDir2_2_2 + "\\RateOnFirstYear.txt");
        file6.createNewFile();
        File file7 = new File(pathToDir2_2_2 + "\\RateOnSecondYear.txt");
        file7.createNewFile();

        //д
        File pathToDir2_2_1 = new File(pathToDir2_2_2 + "\\..\\..\\..\\Drama\\The Irishman\\..\\..\\Comedy\\Notting Hill\\..\\Over Board\\Anna Faris");
        File file8 = new File(pathToDir2_2_1 + "\\RateOnFirstYear.txt");
        file8.createNewFile();
        File file9 = new File(pathToDir2_2_1 + "\\RateOnSecondYear.txt");
        file9.createNewFile();
        //е
        File pathToDir1 = new File(pathToDir2_2_1 + "\\..\\..\\..\\Drama\\..\\Comedy\\Over Board\\Anna Faris\\..\\..\\..\\Drama\\The Big short\\..\\..\\Comedy\\Notting Hill\\Julia Roberts\\Rate8\\..\\..\\..\\..\\Drama");
        File file10 = new File(pathToDir1 + "\\Vikkings.txt");
        file10.createNewFile();
        File file11 = new File(pathToDir1 + "\\The Last Kingdom.txt");
        file11.createNewFile();
        File file12 = new File(pathToDir1 + "\\The Revenant.txt");
        file12.createNewFile();
        File file13 = new File(pathToDir1 + "\\Little Woman.txt");
        file13.createNewFile();

        //є
//        file1.delete();
//        file4.delete();
//        file6.delete();
//        file8.delete();
//        file10.delete();

        //ж
        System.out.println("Existence of the directory from A - "+ mainPath.exists());

        //з
        System.out.println("File from б),isDirectory()  - " + file2.isDirectory());
        System.out.println("File from в), isFile() - " + file5.isFile());
        System.out.println("File from г), length() - " + file7.length());
        System.out.println("File from д), isHidden()- " + file8.isHidden());
        System.out.println("File from е), getName() - " + file12.getName());

    }
}
