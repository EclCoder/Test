package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class ResourceStrategyExecutor implements IResourceStrategy {
    private ResourceStrategy resourceStrategy;

    public ResourceStrategyExecutor(ResourceStrategy resourceStrategy) {
        this.resourceStrategy = resourceStrategy;
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public String getResourceStrategyName() {
        return this.resourceStrategy.getResourceStrategyName();
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public void processResource(MBResourceManager mBResourceManager, IDatabaseHelper iDatabaseHelper, ResourceConfig resourceConfig) {
        ResourceStrategy resourceStrategy = this.resourceStrategy;
        if (resourceStrategy != null) {
            try {
                resourceStrategy.processResource(mBResourceManager, iDatabaseHelper, resourceConfig);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
