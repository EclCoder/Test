package e4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37138a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f37139b = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Idle()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e4.b f37140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e4.b latestEvent, int i10) {
            super(null);
            s.h(latestEvent, "latestEvent");
            this.f37140b = latestEvent;
            this.f37141c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f37141c == cVar.f37141c && s.c(this.f37140b, cVar.f37140b);
        }

        public int hashCode() {
            return (this.f37141c * 31) + this.f37140b.hashCode();
        }

        public String toString() {
            return "InProgress(latestEvent=" + this.f37140b + ", direction=" + this.f37141c + ')';
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
