package um;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final um.a f54825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54828d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54829s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f54830t;

        a(kl.f fVar) {
            super(3, fVar);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fl.c cVar, fl.g0 g0Var, kl.f fVar) {
            a aVar = u0.this.new a(fVar);
            aVar.f54830t = cVar;
            return aVar.invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54829s;
            if (i10 == 0) {
                fl.s.b(obj);
                fl.c cVar = (fl.c) this.f54830t;
                byte bG = u0.this.f54825a.G();
                if (bG == 1) {
                    return u0.this.j(true);
                }
                if (bG == 0) {
                    return u0.this.j(false);
                }
                if (bG != 6) {
                    if (bG == 8) {
                        return u0.this.f();
                    }
                    um.a.x(u0.this.f54825a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                u0 u0Var = u0.this;
                this.f54829s = 1;
                obj = u0Var.h(cVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return (kotlinx.serialization.json.i) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f54832r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f54833s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f54834t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f54835u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f54836v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f54838x;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54836v = obj;
            this.f54838x |= Integer.MIN_VALUE;
            return u0.this.h(null, this);
        }
    }

    public u0(kotlinx.serialization.json.g configuration, um.a lexer) {
        kotlin.jvm.internal.s.h(configuration, "configuration");
        kotlin.jvm.internal.s.h(lexer, "lexer");
        this.f54825a = lexer;
        this.f54826b = configuration.q();
        this.f54827c = configuration.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.i f() {
        byte bJ = this.f54825a.j();
        if (this.f54825a.G() == 4) {
            um.a.x(this.f54825a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f54825a.e()) {
            arrayList.add(e());
            bJ = this.f54825a.j();
            if (bJ != 4) {
                um.a aVar = this.f54825a;
                boolean z10 = bJ == 9;
                int i10 = aVar.f54717a;
                if (!z10) {
                    um.a.x(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bJ == 8) {
            this.f54825a.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.f54827c) {
                g0.h(this.f54825a, "array");
                throw new KotlinNothingValueException();
            }
            this.f54825a.k((byte) 9);
        }
        return new kotlinx.serialization.json.c(arrayList);
    }

    private final kotlinx.serialization.json.i g() {
        return (kotlinx.serialization.json.i) fl.b.b(new fl.a(new a(null)), fl.g0.f38750a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(fl.c r20, kl.f r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.u0.h(fl.c, kl.f):java.lang.Object");
    }

    private final kotlinx.serialization.json.i i() {
        byte bK = this.f54825a.k((byte) 6);
        if (this.f54825a.G() == 4) {
            um.a.x(this.f54825a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.f54825a.e()) {
            String strQ = this.f54826b ? this.f54825a.q() : this.f54825a.o();
            this.f54825a.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.f54825a.j();
            if (bK != 4) {
                if (bK == 7) {
                    break;
                }
                um.a.x(this.f54825a, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bK == 6) {
            this.f54825a.k((byte) 7);
        } else if (bK == 4) {
            if (!this.f54827c) {
                g0.i(this.f54825a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f54825a.k((byte) 7);
        }
        return new kotlinx.serialization.json.d0(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.g0 j(boolean z10) {
        String strQ = (this.f54826b || !z10) ? this.f54825a.q() : this.f54825a.o();
        return (z10 || !kotlin.jvm.internal.s.c(strQ, "null")) ? new kotlinx.serialization.json.w(strQ, z10, null, 4, null) : kotlinx.serialization.json.a0.INSTANCE;
    }

    public final kotlinx.serialization.json.i e() {
        byte bG = this.f54825a.G();
        if (bG == 1) {
            return j(true);
        }
        if (bG == 0) {
            return j(false);
        }
        if (bG == 6) {
            int i10 = this.f54828d + 1;
            this.f54828d = i10;
            kotlinx.serialization.json.i iVarG = i10 == 200 ? g() : i();
            this.f54828d--;
            return iVarG;
        }
        if (bG == 8) {
            return f();
        }
        um.a.x(this.f54825a, "Cannot read Json element because of unexpected " + um.b.c(bG), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
