package d6;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import m6.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements r5.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0545a f36203f = new C0545a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f36204g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f36207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0545a f36208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.b f36209e;

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0545a {
        C0545a() {
        }

        q5.a a(q5.a.InterfaceC0775a interfaceC0775a, q5.c cVar, ByteBuffer byteBuffer, int i10) {
            return new q5.e(interfaceC0775a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f36210a = l.f(0);

        b() {
        }

        synchronized q5.d a(ByteBuffer byteBuffer) {
            q5.d dVar;
            try {
                dVar = (q5.d) this.f36210a.poll();
                if (dVar == null) {
                    dVar = new q5.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(q5.d dVar) {
            dVar.a();
            this.f36210a.offer(dVar);
        }
    }

    public a(Context context, List list, u5.d dVar, u5.b bVar) {
        this(context, list, dVar, bVar, f36204g, f36203f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, q5.d dVar, r5.g gVar) {
        StringBuilder sb2;
        long jB = m6.g.b();
        try {
            q5.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = gVar.c(i.f36250a) == r5.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                q5.a aVarA = this.f36208d.a(this.f36209e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.d(config);
                aVarA.b();
                Bitmap bitmapA = aVarA.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new c(this.f36205a, aVarA, z5.e.c(), i10, i11, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + m6.g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(m6.g.a(jB));
            Log.v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + m6.g.a(jB));
            }
            throw th2;
        }
    }

    private static int e(q5.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i10, int i11, r5.g gVar) {
        q5.d dVarA = this.f36207c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, gVar);
        } finally {
            this.f36207c.b(dVarA);
        }
    }

    @Override // r5.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, r5.g gVar) {
        return !((Boolean) gVar.c(i.f36251b)).booleanValue() && com.bumptech.glide.load.a.g(this.f36206b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List list, u5.d dVar, u5.b bVar, b bVar2, C0545a c0545a) {
        this.f36205a = context.getApplicationContext();
        this.f36206b = list;
        this.f36208d = c0545a;
        this.f36209e = new d6.b(dVar, bVar);
        this.f36207c = bVar2;
    }
}
