package z0;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p extends m implements o0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58466r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58467s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58468t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58470v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58468t = obj;
            this.f58470v |= Integer.MIN_VALUE;
            return p.this.c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(File file, d0 serializer) {
        super(file, serializer);
        kotlin.jvm.internal.s.h(file, "file");
        kotlin.jvm.internal.s.h(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z0.o0
    public Object c(Object obj, kl.f fVar) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f58470v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f58470v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj2 = aVar.f58468t;
        Object objF = ll.b.f();
        int i11 = aVar.f58470v;
        if (i11 == 0) {
            fl.s.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                d0 d0VarH = h();
                m0 m0Var = new m0(fileOutputStream2);
                aVar.f58466r = fileOutputStream2;
                aVar.f58467s = fileOutputStream2;
                aVar.f58470v = 1;
                if (d0VarH.writeTo(obj, m0Var, aVar) == objF) {
                    return objF;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f58467s;
            closeable = (Closeable) aVar.f58466r;
            try {
                fl.s.b(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ql.b.a(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        fl.g0 g0Var = fl.g0.f38750a;
        ql.b.a(closeable, null);
        return fl.g0.f38750a;
    }
}
