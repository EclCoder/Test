/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b708
 * Address  : 0001b708
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001b708(int *param_1,undefined4 param_2,int *param_3,int param_4)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  bool bVar4;
  int *local_60;
  int *local_5c;
  int *local_58;
  int local_54;
  int local_50;
  int iStack_4c;
  int local_48;
  int local_44;
  int local_40;
  int iStack_3c;
  int local_38;
  int iStack_34;
  undefined4 local_30;
  undefined4 local_2c;
  undefined4 local_28;
  
  iVar1 = *(int *)(*param_1 + -8);
  piVar2 = *(int **)(*param_1 + -4);
  iVar3 = (int)param_1 + iVar1;
  local_54 = param_4;
  if (piVar2[1] == param_3[1]) {
    if (param_4 < 0) {
      local_50 = 0;
      if (param_4 != -2) {
        iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        local_2c = 0x1000000;
        local_50 = 0;
        local_40 = 0;
        local_28 = 0;
        local_30 = 1;
        local_60 = param_3;
        local_5c = param_1;
        local_58 = (int *)param_2;
        iStack_3c = iStack_4c;
        local_38 = local_48;
        iStack_34 = local_44;
        (**(code **)(*param_3 + 0x14))(param_3,&local_60,iVar3,iVar3,1,0);
        local_50 = 0;
        if (local_48 == 1) {
          local_50 = iVar3;
        }
      }
    }
    else {
      local_50 = iVar3;
      if (iVar1 + param_4 != 0) {
        local_50 = 0;
      }
    }
  }
  else {
    if ((-1 < param_4) && (iVar1 = (int)param_1 - param_4, iVar3 <= iVar1)) {
      iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
      local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      local_2c = 0x1000000;
      local_50 = 0;
      local_28 = 0;
      local_40 = 0;
      local_30 = 1;
      local_60 = piVar2;
      local_5c = (int *)iVar1;
      local_58 = param_3;
      iStack_3c = iStack_4c;
      local_38 = local_48;
      iStack_34 = local_44;
      (**(code **)(*piVar2 + 0x14))(piVar2,&local_60,iVar3,iVar3,1,0);
      if (local_48 != 0) {
        return iVar1;
      }
    }
    iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    local_50 = 0;
    local_30 = 0;
    local_2c = 0x1000000;
    local_28 = 0;
    local_40 = 0;
    local_60 = param_3;
    local_5c = param_1;
    local_58 = (int *)param_2;
    local_54 = param_4;
    iStack_3c = iStack_4c;
    local_38 = local_48;
    iStack_34 = local_44;
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_60,iVar3,1,0);
    if (iStack_3c == 1) {
      if (local_48 != 1) {
        if (local_38 != 0) {
          return 0;
        }
        bVar4 = local_44 != 1;
        if (!bVar4) {
          local_44 = local_40;
        }
        if (bVar4 || local_44 != 1) {
          return 0;
        }
      }
    }
    else {
      local_50 = 0;
      if (iStack_3c == 0) {
        local_50 = iStack_4c;
        if (local_40 != 1) {
          local_50 = 0;
        }
        if (local_44 != 1 || local_38 != 1) {
          local_50 = 0;
        }
      }
    }
  }
  return local_50;
}


