import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.util.*;
import java.util.logging.Logger;

public class ComapareDirectoryContents {

    //compare directories and subdirectories
    //Write a function to compare 2 directories and their subdirectories/files match by returning a boolean

    public static boolean compareFolders(final Path pathOne, final Path pathSecond) throws IOException {

        // get content of first directory
        final TreeSet<String> treeOne = new TreeSet();
        Files.walkFileTree(pathOne, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Path relPath = pathOne.relativize(file);
                String entry = relPath.toString();
                treeOne.add(entry);
                return FileVisitResult.CONTINUE;
            }
        });

        // get content of second directory
        final TreeSet<String> treeSecond = new TreeSet();
        Files.walkFileTree(pathSecond, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Path relPath = pathSecond.relativize(file);
                String entry = relPath.toString();
                treeSecond.add(entry);
                return FileVisitResult.CONTINUE;
            }
        });
        return treeOne.equals(treeSecond);
    }
        /*{
            map1 = new HashMap<>();
            for(int i=0;i<fileList1.length;i++)
            {
                map1.put(fileList1[i].getName(),fileList1[i]);
            }

            compareNow(fileList2, map1);
        }
        else
        {
            map1 = new HashMap<String, File>();
            for(int i=0;i<fileList2.length;i++)
            {
                map1.put(fileList2[i].getName(),fileList2[i]);
            }
            compareNow(fileList1, map1);
        }
    }

    public static void compareNow(File[] fileArr, HashMap<String, File> map) throws IOException
    {
        for(int i=0;i<fileArr.length;i++)
        {
            String fName = fileArr[i].getName();
            File fComp = map.get(fName);
            map.remove(fName);
            if(fComp!=null)
            {
                if(fComp.isDirectory())
                {
                    getDiff(fileArr[i], fComp);
                }
                else
                {
                    String cSum1 = checksum(fileArr[i]);
                    String cSum2 = checksum(fComp);
                    if(!cSum1.equals(cSum2))
                    {
                        System.out.println(fileArr[i].getName()+"\t\t"+ "different");
                    }
                    else
                    {
                        System.out.println(fileArr[i].getName()+"\t\t"+"identical");
                    }
                }
            }
            else
            {
                if(fileArr[i].isDirectory())
                {
                    traverseDirectory(fileArr[i]);
                }
                else
                {
                    System.out.println(fileArr[i].getName()+"\t\t"+"only in "+fileArr[i].getParent());
                }
            }
        }
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            String n = it.next();
            File fileFrmMap = map.get(n);
            map.remove(n);
            if(fileFrmMap.isDirectory())
            {
                traverseDirectory(fileFrmMap);
            }
            else
            {
                System.out.println(fileFrmMap.getName() +"\t\t"+"only in "+ fileFrmMap.getParent());
            }
        }
    }

    public static void traverseDirectory(File dir)
    {
        File[] list = dir.listFiles();
        for(int k=0;k<list.length;k++)
        {
            if(list[k].isDirectory())
            {
                traverseDirectory(list[k]);
            }
            else
            {
                System.out.println(list[k].getName() +"\t\t"+"only in "+ list[k].getParent());
            }
        }
    }

    public static String checksum(File file)
    {
        try
        {
            InputStream fin = new FileInputStream(file);
            java.security.MessageDigest md5er = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[1024];
            int read;
            do
            {
                read = fin.read(buffer);
                if (read > 0)
                    md5er.update(buffer, 0, read);
            } while (read != -1);
            fin.close();
            byte[] digest = md5er.digest();
            if (digest == null)
                return null;
            String strDigest = "0x";
            for (int i = 0; i < digest.length; i++)
            {
                strDigest += Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1).toUpperCase();
            }
            return strDigest;
        }
        catch (Exception e)
        {
            return null;
        }
    }*/


    public static void main(String[] args){

        //This can be any folder locations which you want to compare
        Path dir1 = Paths.get("/Users/niteshnayak/Documents/test1");
        Path dir2 = Paths.get("/Users/niteshnayak/Documents/test2");
            try
            {
                System.out.println(compareFolders(dir1,dir2));
            }
            catch(IOException ie)
            {
                ie.printStackTrace();
            }
    }
}
