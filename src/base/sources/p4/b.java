package p4;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    List A();

    void B(String str);

    Cursor H(e eVar);

    boolean J0();

    void L();

    void M(String str, Object[] objArr);

    Cursor O(e eVar, CancellationSignal cancellationSignal);

    void P();

    boolean isOpen();

    f j0(String str);

    Cursor v0(String str);

    String w();

    void x();
}
