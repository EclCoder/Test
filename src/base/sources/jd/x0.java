package jd;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x0 {
    public static /* synthetic */ Optional a(Optional optional, Supplier supplier) {
        Objects.requireNonNull(supplier);
        if (optional.isPresent()) {
            return optional;
        }
        Optional optional2 = (Optional) supplier.get();
        Objects.requireNonNull(optional2);
        return optional2;
    }
}
