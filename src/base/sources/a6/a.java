package a6;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f148a;

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0002a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f148a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f148a.position(0);
        return this.f148a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
