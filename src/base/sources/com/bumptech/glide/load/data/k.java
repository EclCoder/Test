package com.bumptech.glide.load.data;

import com.bumptech.glide.load.resource.bitmap.e0;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f11257a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u5.b f11258a;

        public a(u5.b bVar) {
            this.f11258a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f11258a);
        }
    }

    public k(InputStream inputStream, u5.b bVar) {
        e0 e0Var = new e0(inputStream, bVar);
        this.f11257a = e0Var;
        e0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f11257a.release();
    }

    public void c() {
        this.f11257a.d();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f11257a.reset();
        return this.f11257a;
    }
}
