package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f41608a;

    public a(y yVar) {
        this.f41608a = yVar;
    }

    static {
        System.currentTimeMillis();
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f41608a.equals(((a) obj).f41608a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41608a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f41608a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
