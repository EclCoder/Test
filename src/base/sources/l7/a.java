package l7;

import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f43929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Currency f43930c;

    public a(String eventName, double d10, Currency currency) {
        kotlin.jvm.internal.s.h(eventName, "eventName");
        kotlin.jvm.internal.s.h(currency, "currency");
        this.f43928a = eventName;
        this.f43929b = d10;
        this.f43930c = currency;
    }

    public final double a() {
        return this.f43929b;
    }

    public final Currency b() {
        return this.f43930c;
    }

    public final String c() {
        return this.f43928a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.s.c(this.f43928a, aVar.f43928a) && Double.compare(this.f43929b, aVar.f43929b) == 0 && kotlin.jvm.internal.s.c(this.f43930c, aVar.f43930c);
    }

    public int hashCode() {
        return (((this.f43928a.hashCode() * 31) + Double.hashCode(this.f43929b)) * 31) + this.f43930c.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f43928a + ", amount=" + this.f43929b + ", currency=" + this.f43930c + ')';
    }
}
