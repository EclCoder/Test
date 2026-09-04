package x5;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0868b f56646a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements o {

        /* JADX INFO: renamed from: x5.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0867a implements InterfaceC0868b {
            C0867a() {
            }

            @Override // x5.b.InterfaceC0868b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // x5.b.InterfaceC0868b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // x5.o
        public n d(r rVar) {
            return new b(new C0867a());
        }
    }

    /* JADX INFO: renamed from: x5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0868b {
        Class a();

        Object b(byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements o {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements InterfaceC0868b {
            a() {
            }

            @Override // x5.b.InterfaceC0868b
            public Class a() {
                return InputStream.class;
            }

            @Override // x5.b.InterfaceC0868b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // x5.o
        public n d(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0868b interfaceC0868b) {
        this.f56646a = interfaceC0868b;
    }

    @Override // x5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(byte[] bArr, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(bArr), new c(bArr, this.f56646a));
    }

    @Override // x5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f56648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0868b f56649b;

        c(byte[] bArr, InterfaceC0868b interfaceC0868b) {
            this.f56648a = bArr;
            this.f56649b = interfaceC0868b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56649b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            aVar.f(this.f56649b.b(this.f56648a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
