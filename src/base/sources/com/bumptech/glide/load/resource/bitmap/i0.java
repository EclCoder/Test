package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements r5.i {
    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(Bitmap bitmap, int i10, int i11, r5.g gVar) {
        return new a(bitmap);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, r5.g gVar) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements t5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f11534a;

        a(Bitmap bitmap) {
            this.f11534a = bitmap;
        }

        @Override // t5.c
        public Class b() {
            return Bitmap.class;
        }

        @Override // t5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f11534a;
        }

        @Override // t5.c
        public int getSize() {
            return m6.l.h(this.f11534a);
        }

        @Override // t5.c
        public void a() {
        }
    }
}
