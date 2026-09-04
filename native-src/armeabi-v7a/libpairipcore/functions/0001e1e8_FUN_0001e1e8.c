/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e1e8
 * Address  : 0001e1e8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001e1e8(undefined4 *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined1 *puVar1;
  char *pcVar2;
  int iVar3;
  int *piVar4;
  undefined4 *puVar5;
  void *pvVar6;
  char *pcVar7;
  undefined1 *puVar8;
  int unaff_r6;
  char *pcVar9;
  int *piVar10;
  uint uVar11;
  int *__ptr;
  undefined1 *local_24;
  
  local_24 = &stack0xfffffff8;
  pcVar9 = (char *)*param_1;
  pcVar7 = (char *)param_1[1];
  if (pcVar9 == pcVar7) {
    return (int *)0x0;
  }
  if (*pcVar9 != 'T') {
    return (int *)0x0;
  }
  pcVar2 = pcVar9 + 1;
  *param_1 = pcVar2;
  if ((pcVar2 == pcVar7) || (*pcVar2 != 'L')) {
    puVar8 = (undefined1 *)0x0;
  }
  else {
    *param_1 = pcVar9 + 2;
    iVar3 = FUN_0001ddac(param_1,&local_24,0x4c,param_4,param_3,param_4);
    if (iVar3 != 0) {
      return (int *)0x0;
    }
    pcVar2 = (char *)*param_1;
    pcVar7 = (char *)param_1[1];
    if (pcVar2 == pcVar7) {
      return (int *)0x0;
    }
    if (*pcVar2 != '_') {
      return (int *)0x0;
    }
    pcVar2 = pcVar2 + 1;
    *param_1 = pcVar2;
    puVar8 = local_24 + 1;
  }
  if ((pcVar2 == pcVar7) || (*pcVar2 != '_')) {
    iVar3 = FUN_0001ddac(param_1,&stack0xffffffd8);
    if (iVar3 != 0) {
      return (int *)0x0;
    }
    pcVar2 = (char *)*param_1;
    if (pcVar2 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar2 != '_') {
      return (int *)0x0;
    }
    uVar11 = unaff_r6 + 1;
  }
  else {
    uVar11 = 0;
  }
  *param_1 = pcVar2 + 1;
  if (*(char *)((int)param_1 + 0x186) == '\x01') {
    piVar4 = (int *)FUN_0001e86c(param_1,&stack0xffffffd0);
    return piVar4;
  }
  if (*(char *)((int)param_1 + 0x185) != '\x01' || puVar8 != (undefined1 *)0x0) {
    puVar5 = param_1 + 0x53;
    if (((puVar8 < (undefined1 *)((int)(param_1[0x54] - param_1[0x53]) >> 2)) &&
        (piVar4 = (int *)FUN_0001e8a8(puVar5,puVar8), *piVar4 != 0)) &&
       (piVar4 = (int *)FUN_0001e8a8(puVar5,puVar8),
       uVar11 < (uint)(((int *)*piVar4)[1] - *(int *)*piVar4 >> 2))) {
      puVar5 = (undefined4 *)FUN_0001e8a8(puVar5,puVar8);
      puVar5 = (undefined4 *)FUN_0001e98c(*puVar5,uVar11);
      return (int *)*puVar5;
    }
    if (((undefined1 *)param_1[0x62] == puVar8) &&
       (puVar1 = (undefined1 *)((int)(param_1[0x54] - param_1[0x53]) >> 2), puVar8 <= puVar1)) {
      if (puVar8 == puVar1) {
        FUN_0001e8dc(puVar5,&stack0xffffffd0);
      }
      piVar4 = (int *)FUN_0001e94c(param_1,DAT_0001e3c8 + 0x1e372);
      return piVar4;
    }
    return (int *)0x0;
  }
  piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
  FUN_0001e9c0(piVar4,0x2c,2,2,2);
  *(undefined1 *)(piVar4 + 4) = 0;
  piVar4[2] = uVar11;
  piVar4[3] = 0;
  *piVar4 = DAT_0001e3c4 + 0x1e32a;
  if ((char)piVar4[1] != ',') {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e3cc + 0x1e3b8,DAT_0001e3d0 + 0x1e3ba,0x171d,DAT_0001e3d4 + 0x1e3bc);
  }
  piVar10 = (int *)param_1[0x5b];
  if (piVar10 == (int *)param_1[0x5c]) {
    __ptr = (int *)param_1[0x5a];
    iVar3 = (int)piVar10 - (int)__ptr;
    if (__ptr == param_1 + 0x5d) {
      pvVar6 = malloc(iVar3 * 2);
      if (pvVar6 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (piVar10 != __ptr) {
        __aeabi_memmove4(pvVar6,__ptr,iVar3);
      }
      param_1[0x5a] = pvVar6;
    }
    else {
      pvVar6 = realloc(__ptr,iVar3 * 2);
      param_1[0x5a] = pvVar6;
      if (pvVar6 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    piVar10 = (int *)((int)pvVar6 + iVar3);
    param_1[0x5c] = (void *)((int)pvVar6 + (iVar3 >> 1) * 4);
  }
  *piVar10 = (int)piVar4;
  param_1[0x5b] = piVar10 + 1;
  return piVar4;
}


