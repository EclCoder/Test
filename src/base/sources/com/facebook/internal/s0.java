package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f15390a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15391b = s0.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static File f15392c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f15393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f15394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f15395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f15397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f15399g;

        public a(UUID callId, Bitmap bitmap, Uri uri) {
            kotlin.jvm.internal.s.h(callId, "callId");
            this.f15393a = callId;
            this.f15394b = bitmap;
            this.f15395c = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (bm.r.A("content", scheme, true)) {
                    this.f15398f = true;
                    String authority = uri.getAuthority();
                    this.f15399g = (authority == null || bm.r.N(authority, "media", false, 2, null)) ? false : true;
                } else if (bm.r.A("file", uri.getScheme(), true)) {
                    this.f15399g = true;
                } else if (!e1.g0(uri)) {
                    throw new FacebookException("Unsupported scheme for media Uri : " + scheme);
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.f15399g = true;
            }
            String string = this.f15399g ? UUID.randomUUID().toString() : null;
            this.f15397e = string;
            this.f15396d = !this.f15399g ? String.valueOf(uri) : com.facebook.v.f16074a.a(com.facebook.h0.n(), callId, string);
        }

        public final String a() {
            return this.f15397e;
        }

        public final String b() {
            return this.f15396d;
        }

        public final Bitmap c() {
            return this.f15394b;
        }

        public final UUID d() {
            return this.f15393a;
        }

        public final Uri e() {
            return this.f15395c;
        }

        public final boolean f() {
            return this.f15399g;
        }

        public final boolean g() {
            return this.f15398f;
        }
    }

    private s0() {
    }

    public static final void a(Collection collection) {
        File fileG;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (f15392c == null) {
            b();
        }
        f();
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f() && (fileG = g(aVar.d(), aVar.a(), true)) != null) {
                    arrayList.add(fileG);
                    if (aVar.c() != null) {
                        f15390a.j(aVar.c(), fileG);
                    } else if (aVar.e() != null) {
                        f15390a.k(aVar.e(), aVar.g(), fileG);
                    }
                }
            }
        } catch (IOException e10) {
            Log.e(f15391b, "Got unexpected exception:" + e10);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                File file = (File) obj;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e10);
        }
    }

    public static final void b() {
        File fileH = h();
        if (fileH != null) {
            ql.f.o(fileH);
        }
    }

    public static final void c(UUID callId) {
        kotlin.jvm.internal.s.h(callId, "callId");
        File fileI = i(callId, false);
        if (fileI != null) {
            ql.f.o(fileI);
        }
    }

    public static final a d(UUID callId, Bitmap attachmentBitmap) {
        kotlin.jvm.internal.s.h(callId, "callId");
        kotlin.jvm.internal.s.h(attachmentBitmap, "attachmentBitmap");
        return new a(callId, attachmentBitmap, null);
    }

    public static final a e(UUID callId, Uri attachmentUri) {
        kotlin.jvm.internal.s.h(callId, "callId");
        kotlin.jvm.internal.s.h(attachmentUri, "attachmentUri");
        return new a(callId, null, attachmentUri);
    }

    public static final File f() {
        File fileH = h();
        if (fileH != null) {
            fileH.mkdirs();
        }
        return fileH;
    }

    public static final File g(UUID callId, String str, boolean z10) {
        kotlin.jvm.internal.s.h(callId, "callId");
        File fileI = i(callId, z10);
        if (fileI == null) {
            return null;
        }
        try {
            return new File(fileI, URLEncoder.encode(str, C.UTF8_NAME));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File h() {
        try {
            if (f15392c == null) {
                f15392c = new File(com.facebook.h0.m().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15392c;
    }

    public static final File i(UUID callId, boolean z10) {
        kotlin.jvm.internal.s.h(callId, "callId");
        if (f15392c == null) {
            return null;
        }
        File file = new File(f15392c, callId.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final void j(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            e1.j(fileOutputStream);
        }
    }

    private final void k(Uri uri, boolean z10, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            e1.q(!z10 ? new FileInputStream(uri.getPath()) : com.facebook.h0.m().getContentResolver().openInputStream(uri), fileOutputStream);
            e1.j(fileOutputStream);
        } catch (Throwable th2) {
            e1.j(fileOutputStream);
            throw th2;
        }
    }
}
