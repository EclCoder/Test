package com.bytedance.sdk.component.sk.hn.qor.hnj.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.component.utils.ta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private File f12965hn;
    private int hnj;

    private hnj(int i10, File file) {
        this.hnj = i10;
        this.f12965hn = file;
    }

    private static void gjv(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private List<File> hn(File file) {
        List<File> listHnj = hnj(file);
        if (listHnj == null || listHnj.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listHnj) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listHnj, new Comparator<File>() { // from class: com.bytedance.sdk.component.sk.hn.qor.hnj.hnj.hnj.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listHnj;
    }

    public static hnj hnj(int i10, File file) {
        try {
            hnj hnjVar = new hnj(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return hnjVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void qor(File file) {
        if (file == null) {
            return;
        }
        try {
            dse.hn(file);
        } catch (Throwable unused) {
        }
    }

    private File qor(String str) {
        return new File(this.f12965hn, str + ".temp");
    }

    public synchronized InputStream hnj(String str) {
        FileInputStream fileInputStream;
        if (this.hnj <= 0) {
            return null;
        }
        File fileHn = hn(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileHn);
                try {
                    qor(fileHn);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    ta.hnj(fileInputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        }
    }

    private File hn(String str) {
        return new File(this.f12965hn, str);
    }

    public synchronized boolean hnj(String str, byte[] bArr) {
        if (this.hnj > 0 && str != null && bArr != null) {
            File fileQor = qor(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileQor);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileQor.exists()) {
                        hnj(fileQor, hn(str), true);
                    }
                    ta.hnj(fileOutputStream2);
                    List<File> listHnj = hnj(this.f12965hn);
                    if (listHnj != null) {
                        int size = listHnj.size();
                        int i10 = this.hnj;
                        if (size > i10) {
                            hnj((int) (((double) i10) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.f12965hn;
                        if (file != null) {
                            file.mkdirs();
                        }
                        ta.hnj(fileOutputStream);
                        List<File> listHnj2 = hnj(this.f12965hn);
                        if (listHnj2 != null) {
                            int size2 = listHnj2.size();
                            int i11 = this.hnj;
                            if (size2 > i11) {
                                hnj((int) (((double) i11) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        ta.hnj(fileOutputStream);
                        List<File> listHnj3 = hnj(this.f12965hn);
                        if (listHnj3 != null) {
                            int size3 = listHnj3.size();
                            int i12 = this.hnj;
                            if (size3 > i12) {
                                hnj((int) (((double) i12) * 0.7d));
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    ta.hnj(fileOutputStream);
                    List<File> listHnj4 = hnj(this.f12965hn);
                    if (listHnj4 != null) {
                        int size4 = listHnj4.size();
                        int i13 = this.hnj;
                        if (size4 > i13) {
                            hnj((int) (((double) i13) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> hnj(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void hnj(int i10) {
        try {
            if (i10 > this.hnj) {
                return;
            }
            List<File> listHn = hn(this.f12965hn);
            if (listHn != null && listHn.size() > i10) {
                while (i10 < listHn.size()) {
                    File file = listHn.get(i10);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void hnj(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            gjv(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
