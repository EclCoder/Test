package d6;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.i f36253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u5.b f36254c;

    public j(List list, r5.i iVar, u5.b bVar) {
        this.f36252a = list;
        this.f36253b = iVar;
        this.f36254c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(InputStream inputStream, int i10, int i11, r5.g gVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f36253b.a(ByteBuffer.wrap(bArrE), i10, i11, gVar);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, r5.g gVar) {
        return !((Boolean) gVar.c(i.f36251b)).booleanValue() && com.bumptech.glide.load.a.f(this.f36252a, inputStream, this.f36254c) == ImageHeaderParser.ImageType.GIF;
    }
}
