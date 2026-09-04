package vg;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public enum d {
    AMBER("amber", "#FFB74D"),
    PINK("pink", "#EC407A"),
    PURPLE("purple", "#BA68C8"),
    CORAL("coral", "#E57373"),
    BLUE("blue", "#64B5F6"),
    INDIGO("indigo", "#7986CB"),
    GREEN("green", "#81C784"),
    YELLOW("yellow", "#FFD54F"),
    f55533l("teal", "#4DB6AC"),
    BLUE_GREY("blue_grey", "#90A4AE"),
    DEEP_PURPLE("deep_purple", "#9575CD");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55539b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ ml.a f55537p = ml.b.a(d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f55524c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Set used, int i10) {
            Object next;
            s.h(used, "used");
            Iterator<E> it = d.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (used.contains((d) next));
            d dVar = (d) next;
            return dVar == null ? (d) d.g().get(i10 % d.g().size()) : dVar;
        }

        public final d b(String str) {
            Object next;
            Iterator<E> it = d.g().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.c(((d) next).getId(), str)) {
                    return (d) next;
                }
            }
            next = null;
            return (d) next;
        }

        private a() {
        }
    }

    d(String str, String str2) {
        this.f55538a = str;
        this.f55539b = str2;
    }

    public static ml.a g() {
        return f55537p;
    }

    public final String getId() {
        return this.f55538a;
    }

    public final String h() {
        return this.f55539b;
    }
}
