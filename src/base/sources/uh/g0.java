package uh;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.lifecycle.o1;
import androidx.lifecycle.q1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends androidx.lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f54480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.p0 f54481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.k0 f54482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.p0 f54483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hm.v f54484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f54485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f54486i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54487r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.arthenica.ffmpegkit.n f54489t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.arthenica.ffmpegkit.n nVar, kl.f fVar) {
            super(2, fVar);
            this.f54489t = nVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return g0.this.new a(this.f54489t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54487r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = g0.this.f54484g;
                String strE = this.f54489t.e();
                kotlin.jvm.internal.s.g(strE, "getAllLogsAsString(...)");
                this.f54487r = 1;
                if (vVar.emit(strE, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Application application) {
        super(application);
        kotlin.jvm.internal.s.h(application, "application");
        this.f54480c = application;
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(0);
        this.f54481d = p0Var;
        this.f54482e = o1.d(p0Var, new Function1() { // from class: uh.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.z(this.f54452a, (Integer) obj);
            }
        });
        this.f54483f = new androidx.lifecycle.p0(null);
        this.f54484g = hm.b0.b(0, 0, null, 7, null);
    }

    private final String C(int i10) {
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(i10 / 10.0f)}, 1));
        kotlin.jvm.internal.s.g(str, "format(...)");
        return str;
    }

    private final void F(Uri uri) {
        wp.a.a("Export video succeeded", new Object[0]);
        this.f54481d.n(1000);
        this.f54483f.n(uri);
        if (uri != null) {
            nh.l0.A(this.f54480c, "grant_permission_storage");
        }
        r();
    }

    private final void G(com.arthenica.ffmpegkit.n nVar) {
        H("export_failed");
        if (nVar.d() != null) {
            com.google.firebase.crashlytics.a.b().d(new RuntimeException(nVar.d()));
        }
        StringBuilder sb2 = new StringBuilder();
        List<com.arthenica.ffmpegkit.h> listF = nVar.f();
        for (com.arthenica.ffmpegkit.h hVar : listF) {
            if (hVar.a() == com.arthenica.ffmpegkit.g.AV_LOG_ERROR || hVar.a() == com.arthenica.ffmpegkit.g.AV_LOG_FATAL || hVar.a() == com.arthenica.ffmpegkit.g.AV_LOG_PANIC || hVar.a() == com.arthenica.ffmpegkit.g.AV_LOG_WARNING) {
                sb2.append(hVar.b());
                sb2.append("; ");
            }
        }
        if (sb2.length() == 0) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                sb2.append(((com.arthenica.ffmpegkit.h) it.next()).b());
                sb2.append("; ");
            }
        }
        if (sb2.length() > 0) {
            com.google.firebase.crashlytics.a.b().d(new RuntimeException(sb2.toString()));
        } else {
            com.google.firebase.crashlytics.a.b().d(new RuntimeException("Error log is empty"));
        }
        wp.a.a("Failed to export %s", sb2.toString());
        em.k.d(q1.a(this), null, null, new a(nVar, null), 3, null);
        r();
    }

    private final void H(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        FirebaseAnalytics.getInstance(j()).a("export_editing_video", bundle);
    }

    private final void r() {
        ArrayList arrayList = this.f54486i;
        if (arrayList != null) {
            kotlin.jvm.internal.s.e(arrayList);
            Iterator it = arrayList.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.s.g(next, "next(...)");
                new File((String) next).delete();
            }
            this.f54486i = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String, java.lang.String[]] */
    private final void s(File file, String str) throws IOException {
        Object obj;
        Uri contentUri;
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = this.f54480c.getContentResolver();
        kotlin.jvm.internal.s.g(contentResolver, "getContentResolver(...)");
        if (kotlin.jvm.internal.s.c(str, "video/*")) {
            StringBuilder sb2 = new StringBuilder();
            obj = null;
            sb2.append(nh.e.d("_edited"));
            sb2.append(".mp4");
            contentValues.put("_display_name", sb2.toString());
            contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("relative_path", "Movies/AzScreenRecorder/");
            contentValues.put("is_pending", (Integer) 1);
            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        } else {
            obj = null;
            contentValues.put("_display_name", nh.e.d(null) + ".gif");
            contentValues.put("mime_type", "image/gif");
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("relative_path", "Pictures/AzScreenRecorder/");
            contentValues.put("is_pending", (Integer) 1);
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        }
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        kotlin.jvm.internal.s.e(uriInsert);
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert, "w");
        Files.copy(file.toPath(), outputStreamOpenOutputStream);
        if (outputStreamOpenOutputStream != null) {
            outputStreamOpenOutputStream.close();
        }
        file.delete();
        contentValues.clear();
        if (kotlin.jvm.internal.s.c(str, "video/*")) {
            contentValues.put("is_pending", (Integer) 0);
        } else {
            contentValues.put("is_pending", (Integer) 0);
        }
        ?? r10 = obj;
        contentResolver.update(uriInsert, contentValues, r10, r10);
        F(uriInsert);
    }

    private final void t(final String str, final String str2, final long j10, final String str3, final ArrayList arrayList) {
        com.arthenica.ffmpegkit.d.c(str, new com.arthenica.ffmpegkit.f() { // from class: uh.c0
            @Override // com.arthenica.ffmpegkit.f
            public final void a(com.arthenica.ffmpegkit.e eVar) {
                g0.u(this.f54453a, str2, str3, str, j10, arrayList, eVar);
            }
        }, new com.arthenica.ffmpegkit.i() { // from class: uh.d0
            @Override // com.arthenica.ffmpegkit.i
            public final void a(com.arthenica.ffmpegkit.h hVar) {
                g0.w(hVar);
            }
        }, new com.arthenica.ffmpegkit.q() { // from class: uh.e0
            @Override // com.arthenica.ffmpegkit.q
            public final void a(com.arthenica.ffmpegkit.p pVar) {
                g0.x(j10, this, pVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: Exception -> 0x0023, TryCatch #3 {Exception -> 0x0023, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x0017, B:10:0x001c, B:14:0x0034, B:13:0x0026, B:16:0x003a, B:18:0x0047, B:19:0x004a, B:21:0x0054, B:24:0x0064, B:26:0x0073, B:28:0x0077, B:32:0x0090, B:36:0x00cb, B:40:0x00e9, B:42:0x00ed, B:43:0x010b, B:45:0x0111, B:59:0x0169, B:61:0x0170, B:62:0x0177, B:66:0x0192, B:67:0x0195, B:68:0x0196, B:70:0x01b8, B:72:0x01bc, B:73:0x01bf, B:38:0x00da, B:64:0x0190, B:46:0x014d, B:58:0x0166, B:54:0x015f, B:55:0x0162, B:48:0x0157, B:52:0x015d), top: B:82:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9 A[Catch: Exception -> 0x0023, TryCatch #3 {Exception -> 0x0023, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x0017, B:10:0x001c, B:14:0x0034, B:13:0x0026, B:16:0x003a, B:18:0x0047, B:19:0x004a, B:21:0x0054, B:24:0x0064, B:26:0x0073, B:28:0x0077, B:32:0x0090, B:36:0x00cb, B:40:0x00e9, B:42:0x00ed, B:43:0x010b, B:45:0x0111, B:59:0x0169, B:61:0x0170, B:62:0x0177, B:66:0x0192, B:67:0x0195, B:68:0x0196, B:70:0x01b8, B:72:0x01bc, B:73:0x01bf, B:38:0x00da, B:64:0x0190, B:46:0x014d, B:58:0x0166, B:54:0x015f, B:55:0x0162, B:48:0x0157, B:52:0x015d), top: B:82:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: Exception -> 0x0023, TryCatch #3 {Exception -> 0x0023, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x0017, B:10:0x001c, B:14:0x0034, B:13:0x0026, B:16:0x003a, B:18:0x0047, B:19:0x004a, B:21:0x0054, B:24:0x0064, B:26:0x0073, B:28:0x0077, B:32:0x0090, B:36:0x00cb, B:40:0x00e9, B:42:0x00ed, B:43:0x010b, B:45:0x0111, B:59:0x0169, B:61:0x0170, B:62:0x0177, B:66:0x0192, B:67:0x0195, B:68:0x0196, B:70:0x01b8, B:72:0x01bc, B:73:0x01bf, B:38:0x00da, B:64:0x0190, B:46:0x014d, B:58:0x0166, B:54:0x015f, B:55:0x0162, B:48:0x0157, B:52:0x015d), top: B:82:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0111 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #3 {Exception -> 0x0023, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x0017, B:10:0x001c, B:14:0x0034, B:13:0x0026, B:16:0x003a, B:18:0x0047, B:19:0x004a, B:21:0x0054, B:24:0x0064, B:26:0x0073, B:28:0x0077, B:32:0x0090, B:36:0x00cb, B:40:0x00e9, B:42:0x00ed, B:43:0x010b, B:45:0x0111, B:59:0x0169, B:61:0x0170, B:62:0x0177, B:66:0x0192, B:67:0x0195, B:68:0x0196, B:70:0x01b8, B:72:0x01bc, B:73:0x01bf, B:38:0x00da, B:64:0x0190, B:46:0x014d, B:58:0x0166, B:54:0x015f, B:55:0x0162, B:48:0x0157, B:52:0x015d), top: B:82:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0170 A[Catch: Exception -> 0x0023, TryCatch #3 {Exception -> 0x0023, blocks: (B:3:0x0006, B:5:0x0013, B:7:0x0017, B:10:0x001c, B:14:0x0034, B:13:0x0026, B:16:0x003a, B:18:0x0047, B:19:0x004a, B:21:0x0054, B:24:0x0064, B:26:0x0073, B:28:0x0077, B:32:0x0090, B:36:0x00cb, B:40:0x00e9, B:42:0x00ed, B:43:0x010b, B:45:0x0111, B:59:0x0169, B:61:0x0170, B:62:0x0177, B:66:0x0192, B:67:0x0195, B:68:0x0196, B:70:0x01b8, B:72:0x01bc, B:73:0x01bf, B:38:0x00da, B:64:0x0190, B:46:0x014d, B:58:0x0166, B:54:0x015f, B:55:0x0162, B:48:0x0157, B:52:0x015d), top: B:82:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0177 A[SYNTHETIC] */
    public static final void u(final g0 g0Var, String str, String str2, String str3, long j10, ArrayList arrayList, com.arthenica.ffmpegkit.e eVar) {
        String strE;
        File cacheDir;
        Iterator it;
        String strI;
        File fileCreateTempFile;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        ArrayList arrayList2;
        try {
            if (com.arthenica.ffmpegkit.m.c(eVar.o())) {
                File file = g0Var.f54485h;
                if (file == null || Build.VERSION.SDK_INT < 29) {
                    MediaScannerConnection.scanFile(g0Var.f54480c, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: uh.f0
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str4, Uri uri) {
                            g0.v(this.f54477a, str4, uri);
                        }
                    });
                } else {
                    kotlin.jvm.internal.s.e(file);
                    g0Var.s(file, str2);
                }
                g0Var.H("export_successfully");
                return;
            }
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
            if (com.arthenica.ffmpegkit.m.b(eVar.o())) {
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                String strE2 = eVar.e();
                kotlin.jvm.internal.s.g(strE2, "getAllLogsAsString(...)");
                if (bm.r.T(strE2, "Operation not permitted", false, 2, null) && g0Var.f54485h == null) {
                    File cacheDir2 = g0Var.f54480c.getCacheDir();
                    kotlin.jvm.internal.s.g(cacheDir2, "getCacheDir(...)");
                    cacheDir2.mkdirs();
                    File fileCreateTempFile2 = File.createTempFile("temp", kotlin.jvm.internal.s.c(str2, "video/*") ? ".mp4" : ".gif", cacheDir2);
                    g0Var.f54485h = fileCreateTempFile2;
                    kotlin.jvm.internal.s.e(fileCreateTempFile2);
                    String absolutePath = fileCreateTempFile2.getAbsolutePath();
                    kotlin.jvm.internal.s.g(absolutePath, "getAbsolutePath(...)");
                    String strI2 = bm.r.I(str3, str, absolutePath, false, 4, null);
                    wp.a.a("NewCommand: " + strI2, new Object[0]);
                    g0Var.t(strI2, str, j10, str2, arrayList);
                    return;
                }
            }
            if (i10 >= 33) {
                String strE3 = eVar.e();
                kotlin.jvm.internal.s.g(strE3, "getAllLogsAsString(...)");
                if (!bm.r.T(strE3, "Permission denied", false, 2, null)) {
                    strE = eVar.e();
                    kotlin.jvm.internal.s.g(strE, "getAllLogsAsString(...)");
                    if (bm.r.T(strE, "No such file or directory", false, 2, null)) {
                        if (g0Var.f54486i == null) {
                            cacheDir = g0Var.f54480c.getCacheDir();
                            kotlin.jvm.internal.s.g(cacheDir, "getCacheDir(...)");
                            cacheDir.mkdirs();
                            g0Var.f54486i = new ArrayList();
                            it = arrayList.iterator();
                            kotlin.jvm.internal.s.g(it, "iterator(...)");
                            strI = str3;
                            while (it.hasNext()) {
                                Object next = it.next();
                                kotlin.jvm.internal.s.g(next, "next(...)");
                                qh.e eVar2 = (qh.e) next;
                                String strSubstring = eVar2.a().substring(bm.r.l0(eVar2.a(), ".", 0, false, 6, null));
                                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                                fileCreateTempFile = File.createTempFile("temp", strSubstring, cacheDir);
                                inputStreamOpenInputStream = g0Var.f54480c.getContentResolver().openInputStream(eVar2.b());
                                try {
                                    kotlin.jvm.internal.s.e(fileCreateTempFile);
                                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                    if (inputStreamOpenInputStream != null) {
                                        try {
                                            ql.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                ql.b.a(fileOutputStream, th2);
                                                throw th3;
                                            }
                                        }
                                    }
                                    ql.b.a(fileOutputStream, null);
                                    ql.b.a(inputStreamOpenInputStream, null);
                                    arrayList2 = g0Var.f54486i;
                                    if (arrayList2 != null) {
                                        arrayList2.add(fileCreateTempFile.getPath());
                                    }
                                    String strA = eVar2.a();
                                    String absolutePath2 = fileCreateTempFile.getAbsolutePath();
                                    kotlin.jvm.internal.s.g(absolutePath2, "getAbsolutePath(...)");
                                    strI = bm.r.I(strI, strA, absolutePath2, false, 4, null);
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        ql.b.a(inputStreamOpenInputStream, th4);
                                        throw th5;
                                    }
                                }
                            }
                            String str4 = strI;
                            wp.a.a("NewCommand: " + str4, new Object[0]);
                            g0Var.t(str4, str, j10, str2, arrayList);
                            return;
                        }
                    }
                } else if (g0Var.f54486i == null) {
                    cacheDir = g0Var.f54480c.getCacheDir();
                    kotlin.jvm.internal.s.g(cacheDir, "getCacheDir(...)");
                    cacheDir.mkdirs();
                    g0Var.f54486i = new ArrayList();
                    it = arrayList.iterator();
                    kotlin.jvm.internal.s.g(it, "iterator(...)");
                    strI = str3;
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        kotlin.jvm.internal.s.g(next2, "next(...)");
                        qh.e eVar3 = (qh.e) next2;
                        String strSubstring2 = eVar3.a().substring(bm.r.l0(eVar3.a(), ".", 0, false, 6, null));
                        kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                        fileCreateTempFile = File.createTempFile("temp", strSubstring2, cacheDir);
                        inputStreamOpenInputStream = g0Var.f54480c.getContentResolver().openInputStream(eVar3.b());
                        kotlin.jvm.internal.s.e(fileCreateTempFile);
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        if (inputStreamOpenInputStream != null) {
                            ql.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                        }
                        ql.b.a(fileOutputStream, null);
                        ql.b.a(inputStreamOpenInputStream, null);
                        arrayList2 = g0Var.f54486i;
                        if (arrayList2 != null) {
                            arrayList2.add(fileCreateTempFile.getPath());
                        }
                        String strA2 = eVar3.a();
                        String absolutePath3 = fileCreateTempFile.getAbsolutePath();
                        kotlin.jvm.internal.s.g(absolutePath3, "getAbsolutePath(...)");
                        strI = bm.r.I(strI, strA2, absolutePath3, false, 4, null);
                    }
                    String str5 = strI;
                    wp.a.a("NewCommand: " + str5, new Object[0]);
                    g0Var.t(str5, str, j10, str2, arrayList);
                    return;
                }
            } else {
                strE = eVar.e();
                kotlin.jvm.internal.s.g(strE, "getAllLogsAsString(...)");
                if (bm.r.T(strE, "No such file or directory", false, 2, null)) {
                    if (g0Var.f54486i == null) {
                        cacheDir = g0Var.f54480c.getCacheDir();
                        kotlin.jvm.internal.s.g(cacheDir, "getCacheDir(...)");
                        cacheDir.mkdirs();
                        g0Var.f54486i = new ArrayList();
                        it = arrayList.iterator();
                        kotlin.jvm.internal.s.g(it, "iterator(...)");
                        strI = str3;
                        while (it.hasNext()) {
                            Object next3 = it.next();
                            kotlin.jvm.internal.s.g(next3, "next(...)");
                            qh.e eVar4 = (qh.e) next3;
                            String strSubstring3 = eVar4.a().substring(bm.r.l0(eVar4.a(), ".", 0, false, 6, null));
                            kotlin.jvm.internal.s.g(strSubstring3, "substring(...)");
                            fileCreateTempFile = File.createTempFile("temp", strSubstring3, cacheDir);
                            inputStreamOpenInputStream = g0Var.f54480c.getContentResolver().openInputStream(eVar4.b());
                            kotlin.jvm.internal.s.e(fileCreateTempFile);
                            fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            if (inputStreamOpenInputStream != null) {
                                ql.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                            }
                            ql.b.a(fileOutputStream, null);
                            ql.b.a(inputStreamOpenInputStream, null);
                            arrayList2 = g0Var.f54486i;
                            if (arrayList2 != null) {
                                arrayList2.add(fileCreateTempFile.getPath());
                            }
                            String strA3 = eVar4.a();
                            String absolutePath4 = fileCreateTempFile.getAbsolutePath();
                            kotlin.jvm.internal.s.g(absolutePath4, "getAbsolutePath(...)");
                            strI = bm.r.I(strI, strA3, absolutePath4, false, 4, null);
                        }
                        String str6 = strI;
                        wp.a.a("NewCommand: " + str6, new Object[0]);
                        g0Var.t(str6, str, j10, str2, arrayList);
                        return;
                    }
                }
            }
            File file3 = g0Var.f54485h;
            if (file3 != null) {
                file3.delete();
            }
            kotlin.jvm.internal.s.e(eVar);
            g0Var.G(eVar);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            kotlin.jvm.internal.s.e(eVar);
            g0Var.G(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(g0 g0Var, String str, Uri uri) {
        g0Var.F(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(com.arthenica.ffmpegkit.h log) {
        kotlin.jvm.internal.s.h(log, "log");
        wp.a.a("My log for video/audio: %s", log.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(long j10, g0 g0Var, com.arthenica.ffmpegkit.p statistics) {
        kotlin.jvm.internal.s.h(statistics, "statistics");
        g0Var.f54481d.n(Integer.valueOf((int) ((statistics.a() * ((double) 1000)) / j10)));
        wp.a.a("Statistics time: " + statistics.a() + ". Statistic percent " + g0Var.f54481d.f(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(g0 g0Var, Integer num) {
        kotlin.jvm.internal.s.e(num);
        return g0Var.C(num.intValue());
    }

    public final androidx.lifecycle.p0 A() {
        return this.f54481d;
    }

    public final androidx.lifecycle.k0 B() {
        return this.f54482e;
    }

    public final hm.z D() {
        return this.f54484g;
    }

    public final androidx.lifecycle.p0 E() {
        return this.f54483f;
    }

    public final void q() {
        this.f54481d.q(0);
        com.arthenica.ffmpegkit.d.a();
        wp.a.a("Cancel export", new Object[0]);
    }

    public final void y(String command, String outputPath, long j10, String type, ArrayList inputPathList) {
        kotlin.jvm.internal.s.h(command, "command");
        kotlin.jvm.internal.s.h(outputPath, "outputPath");
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(inputPathList, "inputPathList");
        long j11 = j10 / ((long) 1000);
        int[] iArr = pf.b.f50035d;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length && j11 >= iArr[i11]; i11++) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Video edit duration: ");
        String[] strArr = pf.b.f50036e;
        sb2.append(strArr[i10]);
        wp.a.a(sb2.toString(), new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString("edit_duration", strArr[i10]);
        FirebaseAnalytics.getInstance(j()).a("video_edit_duration", bundle);
        this.f54485h = null;
        this.f54486i = null;
        t(command, outputPath, j10, type, inputPathList);
    }
}
