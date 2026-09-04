package pd;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f50014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f50015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f50016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f50017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f50018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f50019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f50020g;

    public j(Context context) {
        String str;
        String strD = gd.i.f39126a.e(context).d();
        this.f50014a = strD;
        File filesDir = context.getFilesDir();
        this.f50015b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f50016c = fileS;
        this.f50017d = s(new File(fileS, "open-sessions"));
        this.f50018e = s(new File(fileS, "reports"));
        this.f50019f = s(new File(fileS, "priority-reports"));
        this.f50020g = s(new File(fileS, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f50015b, str);
        if (file.exists() && u(file)) {
            gd.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f50015b.exists() || (list = this.f50015b.list(new FilenameFilter() { // from class: pd.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return t(new File(this.f50017d, str));
    }

    private static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                gd.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                gd.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    private static List v(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    static String w(String str) {
        return str.length() > 40 ? jd.i.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean x() {
        return !this.f50014a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f50017d, str));
    }

    public List f() {
        return v(this.f50017d.list());
    }

    public File g(String str) {
        return new File(this.f50016c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return v(this.f50016c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f50020g, str);
    }

    public List j() {
        return v(this.f50020g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f50019f, str);
    }

    public List m() {
        return v(this.f50019f.listFiles());
    }

    public File n(String str) {
        return new File(this.f50018e, str);
    }

    public List o() {
        return v(this.f50018e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
