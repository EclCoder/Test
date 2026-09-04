package wg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Exception f56268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exception) {
            super(null);
            s.h(exception, "exception");
            this.f56268a = exception;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.c(this.f56268a, ((a) obj).f56268a);
        }

        public int hashCode() {
            return this.f56268a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f56268a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f56269a;

        public b(Object obj) {
            super(null);
            this.f56269a = obj;
        }

        public final Object a() {
            return this.f56269a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.c(this.f56269a, ((b) obj).f56269a);
        }

        public int hashCode() {
            Object obj = this.f56269a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f56269a + ')';
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
