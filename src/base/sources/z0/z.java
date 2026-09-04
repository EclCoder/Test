package z0;

import android.os.FileObserver;
import em.e1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z extends FileObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58518c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f58519d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f58520e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f58522b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: z0.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0898a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f58523r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f58524s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f58525t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ File f58526u;

            /* JADX INFO: renamed from: z0.z$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0899a extends kotlin.jvm.internal.t implements tl.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e1 f58527a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0899a(e1 e1Var) {
                    super(0);
                    this.f58527a = e1Var;
                }

                @Override // tl.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m202invoke();
                    return fl.g0.f38750a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m202invoke() {
                    this.f58527a.d();
                }
            }

            /* JADX INFO: renamed from: z0.z$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class b extends kotlin.jvm.internal.t implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ File f58528a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ gm.s f58529b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(File file, gm.s sVar) {
                    super(1);
                    this.f58528a = file;
                    this.f58529b = sVar;
                }

                public final void a(String str) {
                    if (kotlin.jvm.internal.s.c(str, this.f58528a.getName())) {
                        gm.m.b(this.f58529b, fl.g0.f38750a);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((String) obj);
                    return fl.g0.f38750a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0898a(File file, kl.f fVar) {
                super(2, fVar);
                this.f58526u = file;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(gm.s sVar, kl.f fVar) {
                return ((C0898a) create(sVar, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0898a c0898a = new C0898a(this.f58526u, fVar);
                c0898a.f58525t = obj;
                return c0898a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (gm.q.a(r3, r7, r6) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ll.b.f()
                    int r1 = r6.f58524s
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    fl.s.b(r7)
                    goto L66
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    java.lang.Object r1 = r6.f58523r
                    em.e1 r1 = (em.e1) r1
                    java.lang.Object r3 = r6.f58525t
                    gm.s r3 = (gm.s) r3
                    fl.s.b(r7)
                    goto L53
                L26:
                    fl.s.b(r7)
                    java.lang.Object r7 = r6.f58525t
                    gm.s r7 = (gm.s) r7
                    z0.z$a$a$b r1 = new z0.z$a$a$b
                    java.io.File r4 = r6.f58526u
                    r1.<init>(r4, r7)
                    z0.z$a r4 = z0.z.f58518c
                    java.io.File r5 = r6.f58526u
                    java.io.File r5 = r5.getParentFile()
                    kotlin.jvm.internal.s.e(r5)
                    em.e1 r1 = z0.z.a.b(r4, r5, r1)
                    fl.g0 r4 = fl.g0.f38750a
                    r6.f58525t = r7
                    r6.f58523r = r1
                    r6.f58524s = r3
                    java.lang.Object r3 = r7.o(r4, r6)
                    if (r3 != r0) goto L52
                    goto L65
                L52:
                    r3 = r7
                L53:
                    z0.z$a$a$a r7 = new z0.z$a$a$a
                    r7.<init>(r1)
                    r1 = 0
                    r6.f58525t = r1
                    r6.f58523r = r1
                    r6.f58524s = r2
                    java.lang.Object r7 = gm.q.a(r3, r7, r6)
                    if (r7 != r0) goto L66
                L65:
                    return r0
                L66:
                    fl.g0 r7 = fl.g0.f38750a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.z.a.C0898a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e1 d(File file, final Function1 function1) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (z.f58519d) {
                try {
                    Map mapC = z.f58518c.c();
                    kotlin.jvm.internal.s.g(key, "key");
                    Object zVar = mapC.get(key);
                    if (zVar == null) {
                        zVar = new z(key, null);
                        mapC.put(key, zVar);
                    }
                    z zVar2 = (z) zVar;
                    zVar2.f58522b.add(function1);
                    if (zVar2.f58522b.size() == 1) {
                        zVar2.startWatching();
                    }
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new e1() { // from class: z0.y
                @Override // em.e1
                public final void d() {
                    z.a.f(key, function1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(String str, Function1 observer) {
            kotlin.jvm.internal.s.h(observer, "$observer");
            synchronized (z.f58519d) {
                try {
                    a aVar = z.f58518c;
                    z zVar = (z) aVar.c().get(str);
                    if (zVar != null) {
                        zVar.f58522b.remove(observer);
                        if (zVar.f58522b.isEmpty()) {
                            aVar.c().remove(str);
                            zVar.stopWatching();
                        }
                    }
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final Map c() {
            return z.f58520e;
        }

        public final hm.e e(File file) {
            kotlin.jvm.internal.s.h(file, "file");
            return hm.g.g(new C0898a(file, null));
        }

        private a() {
        }
    }

    public /* synthetic */ z(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        Iterator it = this.f58522b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }

    private z(String str) {
        super(str, 128);
        this.f58521a = str;
        this.f58522b = new CopyOnWriteArrayList();
    }
}
