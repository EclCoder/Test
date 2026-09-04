package dj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String value) {
        super(value);
        s.h(value, "value");
    }

    @Override // dj.e, dj.b
    public l b() {
        return l.XML_DOCUMENT;
    }

    @Override // dj.e
    public String toString() {
        return "AmfXmlDocument value: " + g();
    }

    public /* synthetic */ o(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
