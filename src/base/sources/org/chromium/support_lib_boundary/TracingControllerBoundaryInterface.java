package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i10, Collection<String> collection, int i11);

    boolean stop(OutputStream outputStream, Executor executor);
}
