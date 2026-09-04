package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.e0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0152a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f11217a;

        C0152a(InputStream inputStream) {
            this.f11217a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f11217a);
            } finally {
                this.f11217a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f11218a;

        b(ByteBuffer byteBuffer) {
            this.f11218a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f11218a);
            } finally {
                m6.a.d(this.f11218a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f11219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11220b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
            this.f11219a = parcelFileDescriptorRewinder;
            this.f11220b = bVar;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            e0 e0Var = null;
            try {
                e0 e0Var2 = new e0(new FileInputStream(this.f11219a.a().getFileDescriptor()), this.f11220b);
                try {
                    ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(e0Var2);
                    e0Var2.release();
                    this.f11219a.a();
                    return imageTypeD;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        e0Var.release();
                    }
                    this.f11219a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f11221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11222b;

        d(ByteBuffer byteBuffer, u5.b bVar) {
            this.f11221a = byteBuffer;
            this.f11222b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.f(this.f11221a, this.f11222b);
            } finally {
                m6.a.d(this.f11221a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f11223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11224b;

        e(InputStream inputStream, u5.b bVar) {
            this.f11223a = inputStream;
            this.f11224b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f11223a, this.f11224b);
            } finally {
                this.f11223a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f11225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11226b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
            this.f11225a = parcelFileDescriptorRewinder;
            this.f11226b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            e0 e0Var = null;
            try {
                e0 e0Var2 = new e0(new FileInputStream(this.f11225a.a().getFileDescriptor()), this.f11226b);
                try {
                    int iB = imageHeaderParser.b(e0Var2, this.f11226b);
                    e0Var2.release();
                    this.f11225a.a();
                    return iB;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        e0Var.release();
                    }
                    this.f11225a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f11227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11228b;

        g(ByteBuffer byteBuffer, u5.b bVar) {
            this.f11227a = byteBuffer;
            this.f11228b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.e(this.f11227a, this.f11228b);
            } finally {
                m6.a.d(this.f11227a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f11229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11230b;

        h(InputStream inputStream, u5.b bVar) {
            this.f11229a = inputStream;
            this.f11230b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f11229a, this.f11230b);
            } finally {
                this.f11229a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f11231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u5.b f11232b;

        i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
            this.f11231a = parcelFileDescriptorRewinder;
            this.f11232b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
            e0 e0Var = null;
            try {
                e0 e0Var2 = new e0(new FileInputStream(this.f11231a.a().getFileDescriptor()), this.f11232b);
                try {
                    boolean zA = imageHeaderParser.a(e0Var2, this.f11232b);
                    e0Var2.release();
                    this.f11231a.a();
                    return zA;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        e0Var.release();
                    }
                    this.f11231a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface j {
        boolean a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface k {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, u5.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, u5.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, k kVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = kVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, u5.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0152a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = lVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean i(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u5.b bVar) {
        return l(list, new i(parcelFileDescriptorRewinder, bVar));
    }

    public static boolean j(List list, InputStream inputStream, u5.b bVar) {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new e0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, bVar));
    }

    public static boolean k(List list, ByteBuffer byteBuffer, u5.b bVar) {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, bVar));
    }

    private static boolean l(List list, j jVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jVar.a((ImageHeaderParser) list.get(i10))) {
                return true;
            }
        }
        return false;
    }
}
