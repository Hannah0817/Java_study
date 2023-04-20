package com.hainiu.Sort;

import java.io.File;

//统计一个文件夹的大小 字节
public class Demo06 {
    public static void main(String[] args) {
        long length = getLength ( new File ( "C:\\Users\\高新廷\\Desktop\\22 Linux" ) );
        System.out.println (length );

    }

    private static long getLength(File file) {
        //
        long length = 0;
        if (!file.exists ( )) {
            return 0;
        }
            if (file.isFile ( )) {
                return file.length ( );
            }
            File[] files = file.listFiles ( );
            if (files != null) {
                for (File f : files) {
                    if (f.isFile ( )) {
                        length += getLength ( f );
                    } else {
                        length += getLength ( f );
                    }
                }
            }

            return length;
        }

}