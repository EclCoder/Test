package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
interface a0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f11497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u5.b f11498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f11499c;

        b(InputStream inputStream, List list, u5.b bVar) {
            this.f11498b = (u5.b) m6.k.e(bVar);
            this.f11499c = (List) m6.k.e(list);
            this.f11497a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public Bitmap a(BitmapFactory.Options options) {
            return x.b(this.f11497a.a(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public boolean b() {
            return com.bumptech.glide.load.a.j(this.f11499c, this.f11497a.a(), this.f11498b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public void c() {
            this.f11497a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public int d() {
            return com.bumptech.glide.load.a.b(this.f11499c, this.f11497a.a(), this.f11498b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.f(this.f11499c, this.f11497a.a(), this.f11498b);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    boolean b();

    void c();

    int d();

    ImageHeaderParser.ImageType e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f11495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u5.b f11496c;

        a(ByteBuffer byteBuffer, List list, u5.b bVar) {
            this.f11494a = byteBuffer;
            this.f11495b = list;
            this.f11496c = bVar;
        }

        private InputStream f() {
            return m6.a.g(m6.a.d(this.f11494a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public Bitmap a(BitmapFactory.Options options) {
            return x.b(f(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public boolean b() {
            return com.bumptech.glide.load.a.k(this.f11495b, m6.a.d(this.f11494a), this.f11496c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public int d() {
            return com.bumptech.glide.load.a.c(this.f11495b, m6.a.d(this.f11494a), this.f11496c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.g(this.f11495b, m6.a.d(this.f11494a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public void c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u5.b f11500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f11501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f11502c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, u5.b bVar) {
            this.f11500a = (u5.b) m6.k.e(bVar);
            this.f11501b = (List) m6.k.e(list);
            this.f11502c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public Bitmap a(BitmapFactory.Options options) {
            return x.a(this.f11502c.a().getFileDescriptor(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public boolean b() {
            return com.bumptech.glide.load.a.i(this.f11501b, this.f11502c, this.f11500a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public int d() {
            return com.bumptech.glide.load.a.a(this.f11501b, this.f11502c, this.f11500a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.e(this.f11501b, this.f11502c, this.f11500a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0
        public void c() {
        }
    }
}
