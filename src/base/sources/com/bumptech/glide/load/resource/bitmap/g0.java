package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f11523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.b f11524b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f11525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m6.d f11526b;

        a(e0 e0Var, m6.d dVar) {
            this.f11525a = e0Var;
            this.f11526b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.r.b
        public void a(u5.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionD = this.f11526b.d();
            if (iOExceptionD != null) {
                if (bitmap == null) {
                    throw iOExceptionD;
                }
                dVar.d(bitmap);
                throw iOExceptionD;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.r.b
        public void b() {
            this.f11525a.d();
        }
    }

    public g0(r rVar, u5.b bVar) {
        this.f11523a = rVar;
        this.f11524b = bVar;
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(InputStream inputStream, int i10, int i11, r5.g gVar) {
        boolean z10;
        e0 e0Var;
        if (inputStream instanceof e0) {
            e0Var = (e0) inputStream;
            z10 = false;
        } else {
            z10 = true;
            e0Var = new e0(inputStream, this.f11524b);
        }
        m6.d dVarH = m6.d.h(e0Var);
        try {
            return this.f11523a.f(new m6.i(dVarH), i10, i11, gVar, new a(e0Var, dVarH));
        } finally {
            dVarH.release();
            if (z10) {
                e0Var.release();
            }
        }
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, r5.g gVar) {
        return this.f11523a.p(inputStream);
    }
}
