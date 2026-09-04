package j8;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k8.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set f42110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final j8.b.InterfaceC0639b f42111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final j8.b.a f42112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f42113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f42114e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f42115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42117c;

        a(Context context, String str, String str2, j8.b.c cVar) {
            this.f42115a = context;
            this.f42116b = str;
            this.f42117c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                j8.c r1 = j8.c.this     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f42115a     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f42116b     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f42117c     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                j8.c.a(r1, r2, r3, r4)     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.c.a.run():void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42119a;

        b(String str) {
            this.f42119a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f42119a);
        }
    }

    protected c() {
        this(new d(), new j8.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) throws Throwable {
        c cVar;
        Context context2;
        i iVar;
        if (this.f42110a.contains(str) && !this.f42113d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f42111b.a(str);
            this.f42110a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f42113d) {
                if (this.f42113d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                cVar = this;
                context2 = context;
                this.f42112c.a(context2, this.f42111b.d(), this.f42111b.b(str), fileD, cVar);
            } else {
                cVar = this;
                context2 = context;
            }
            try {
                if (cVar.f42114e) {
                    try {
                        iVar = new i(fileD);
                        try {
                            List listH = iVar.h();
                            iVar.close();
                            Iterator it = listH.iterator();
                            while (it.hasNext()) {
                                e(context2, cVar.f42111b.c((String) it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (iVar == null) {
                                throw th3;
                            }
                            iVar.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            cVar.f42111b.e(fileD.getAbsolutePath());
            cVar.f42110a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f42111b.b(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f42113d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String strB = this.f42111b.b(str);
        if (e.a(str2)) {
            return new File(c(context), strB);
        }
        return new File(c(context), strB + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, j8.b.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (e.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (cVar == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected c(j8.b.InterfaceC0639b interfaceC0639b, j8.b.a aVar) {
        this.f42110a = new HashSet();
        if (interfaceC0639b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f42111b = interfaceC0639b;
        this.f42112c = aVar;
    }

    public void h(String str) {
    }
}
