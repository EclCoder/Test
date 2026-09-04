package oe;

import android.util.Log;
import fl.g0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kl.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f48516a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f48517b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f48520r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f48521s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f48522t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f48523u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f48524v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f48525w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f48527y;

        b(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48525w = obj;
            this.f48527y |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d.a subscriberName) {
        s.h(subscriberName, "subscriberName");
        Map dependencies = f48517b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        s.g(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(new CountDownLatch(1), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    private final a c(d.a aVar) {
        Map dependencies = f48517b;
        s.g(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            s.g(obj, "getOrElse(...)");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 e(a aVar) throws InterruptedException {
        aVar.a().await();
        return g0.f38750a;
    }

    public static final void g(d subscriber) {
        s.h(subscriber, "subscriber");
        d.a aVarC = subscriber.c();
        a aVarC2 = f48516a.c(aVarC);
        if (aVarC2.b() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarC + " already registered.");
            return;
        }
        aVarC2.c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarC + " registered.");
        aVarC2.a().countDown();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(kl.f r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof oe.c.b
            if (r0 == 0) goto L13
            r0 = r9
            oe.c$b r0 = (oe.c.b) r0
            int r1 = r0.f48527y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48527y = r1
            goto L18
        L13:
            oe.c$b r0 = new oe.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f48525w
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f48527y
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r2 = r0.f48524v
            java.lang.Object r4 = r0.f48523u
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f48522t
            oe.d$a r5 = (oe.d.a) r5
            java.lang.Object r6 = r0.f48521s
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.f48520r
            java.util.Map r7 = (java.util.Map) r7
            fl.s.b(r9)
            goto L9a
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L43:
            fl.s.b(r9)
            java.util.Map r9 = oe.c.f48517b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.s.g(r9, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = gl.l0.e(r4)
            r2.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r4 = r2
        L64:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La5
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r2 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            oe.d$a r5 = (oe.d.a) r5
            java.lang.Object r9 = r9.getValue()
            oe.c$a r9 = (oe.c.a) r9
            oe.b r7 = new oe.b
            r7.<init>()
            r0.f48520r = r4
            r0.f48521s = r6
            r0.f48522t = r5
            r0.f48523u = r4
            r0.f48524v = r2
            r0.f48527y = r3
            r9 = 0
            java.lang.Object r9 = em.w1.c(r9, r7, r0, r3, r9)
            if (r9 != r1) goto L99
            return r1
        L99:
            r7 = r4
        L9a:
            oe.c r9 = oe.c.f48516a
            oe.d r9 = r9.f(r5)
            r4.put(r2, r9)
            r4 = r7
            goto L64
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.d(kl.f):java.lang.Object");
    }

    public final d f(d.a subscriberName) {
        s.h(subscriberName, "subscriberName");
        d dVarB = c(subscriberName).b();
        if (dVarB != null) {
            return dVarB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f48518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f48519b;

        public a(CountDownLatch latch, d dVar) {
            s.h(latch, "latch");
            this.f48518a = latch;
            this.f48519b = dVar;
        }

        public final CountDownLatch a() {
            return this.f48518a;
        }

        public final d b() {
            return this.f48519b;
        }

        public final void c(d dVar) {
            this.f48519b = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.c(this.f48518a, aVar.f48518a) && s.c(this.f48519b, aVar.f48519b);
        }

        public int hashCode() {
            int iHashCode = this.f48518a.hashCode() * 31;
            d dVar = this.f48519b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "Dependency(latch=" + this.f48518a + ", subscriber=" + this.f48519b + ')';
        }

        public /* synthetic */ a(CountDownLatch countDownLatch, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(countDownLatch, (i10 & 2) != 0 ? null : dVar);
        }
    }
}
