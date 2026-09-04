package e6;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f37157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37158b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // e6.e
    public t5.c a(t5.c cVar, r5.g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cVar.get()).compress(this.f37157a, this.f37158b, byteArrayOutputStream);
        cVar.a();
        return new a6.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f37157a = compressFormat;
        this.f37158b = i10;
    }
}
