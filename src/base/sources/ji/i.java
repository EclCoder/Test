package ji;

import android.media.MediaCodec;
import com.mbridge.msdk.foundation.tools.SameMD5;
import em.c1;
import em.k0;
import em.o0;
import fl.g0;
import fl.s;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42567r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ tl.a f42568s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(tl.a aVar, kl.f fVar) {
            super(2, fVar);
            this.f42568s = aVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new b(this.f42568s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f42567r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.f42568s.invoke();
            return g0.f38750a;
        }
    }

    public static final String c(byte[] bArr) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        return gl.j.k0(bArr, "", null, null, 0, null, new Function1() { // from class: ji.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.d(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(byte b10) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        kotlin.jvm.internal.s.g(str, "format(...)");
        return str;
    }

    public static final Integer[] e(String str, char c10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i11 + 1;
            if (str.charAt(i10) == c10) {
                arrayList.add(Integer.valueOf(i11));
            }
            i10++;
            i11 = i12;
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    public static final String f(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bytes = str.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            kotlin.jvm.internal.s.g(bArrDigest, "digest(...)");
            return c(bArrDigest);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final kl.f g() {
        return new a();
    }

    public static final boolean h(MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.s.h(bufferInfo, "<this>");
        return bufferInfo.flags == 1;
    }

    public static final ExecutorService i(LinkedBlockingQueue queue) {
        kotlin.jvm.internal.s.h(queue, "queue");
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);
    }

    public static final Object j(tl.a aVar, kl.f fVar) {
        Object objJ = em.i.j(c1.c(), new b(aVar, null), fVar);
        return objJ == ll.b.f() ? objJ : g0.f38750a;
    }

    public static final ByteBuffer k(ByteBuffer byteBuffer, MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.s.h(byteBuffer, "<this>");
        kotlin.jvm.internal.s.h(info, "info");
        try {
            byteBuffer.position(info.offset);
            byteBuffer.limit(info.size);
        } catch (Exception unused) {
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        kotlin.jvm.internal.s.g(byteBufferSlice, "slice(...)");
        return byteBufferSlice;
    }

    public static final void l(ExecutorService executorService, long j10, final tl.a code) {
        kotlin.jvm.internal.s.h(executorService, "<this>");
        kotlin.jvm.internal.s.h(code, "code");
        try {
            if (!executorService.isTerminated() && !executorService.isShutdown()) {
                executorService.submit(new Runnable() { // from class: ji.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.n(code);
                    }
                }).get(j10, TimeUnit.MILLISECONDS);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void m(ExecutorService executorService, long j10, tl.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        l(executorService, j10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(tl.a aVar) {
        aVar.invoke();
    }

    public static final byte[] o(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.s.h(byteBuffer, "<this>");
        if (byteBuffer.hasArray() && !byteBuffer.isDirect()) {
            byte[] bArrArray = byteBuffer.array();
            kotlin.jvm.internal.s.e(bArrArray);
            return bArrArray;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements kl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k0 f42566a = c1.b();

        a() {
        }

        @Override // kl.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 getContext() {
            return this.f42566a;
        }

        @Override // kl.f
        public void resumeWith(Object obj) {
        }
    }
}
