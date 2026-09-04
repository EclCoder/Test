/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023df0
 * Address  : 00023df0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023df0(int *param_1,int param_2,undefined4 param_3)

{
  undefined4 *puVar1;
  int iVar2;
  undefined4 *puVar3;
  uint uVar4;
  int *piVar5;
  undefined4 *puVar6;
  int iVar7;
  undefined4 *local_50;
  undefined4 *local_4c;
  undefined4 *local_48;
  undefined4 local_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  undefined4 uStack_38;
  undefined4 local_34;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  
  piVar5 = *(int **)(param_2 + 8);
  iVar7 = *(int *)(param_2 + 0xc);
  uStack_40 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uStack_3c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_38 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[1] = (int)piVar5;
  local_44 = 0;
  local_34 = 0;
  local_48 = (undefined4 *)&stack0xffffffdc;
  local_50 = &local_44;
  local_4c = &local_44;
  uStack_30 = uStack_40;
  uStack_2c = uStack_3c;
  uStack_28 = uStack_38;
  do {
    do {
      iVar2 = (**(code **)(*piVar5 + 0xc))(piVar5,param_3);
      puVar1 = local_4c;
      puVar6 = local_50;
      if (*(char *)(iVar2 + 4) != '\r') {
        *param_1 = iVar7;
        param_1[1] = (int)piVar5;
        goto LAB_00023ec2;
      }
      piVar5 = *(int **)(iVar2 + 8);
      if (*(int *)(iVar2 + 0xc) < iVar7) {
        iVar7 = *(int *)(iVar2 + 0xc);
      }
      if (local_4c == local_48) {
        iVar2 = (int)local_4c - (int)local_50;
        if (local_50 == &local_44) {
          puVar3 = malloc(iVar2 * 2);
          if (puVar3 == (undefined4 *)0x0) {
            *param_1 = iVar7;
            param_1[1] = (int)piVar5;
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (puVar1 != &local_44) {
            __aeabi_memmove4(puVar3,puVar6,iVar2);
          }
        }
        else {
          puVar3 = realloc(local_50,iVar2 * 2);
          if (puVar3 == (undefined4 *)0x0) {
            *param_1 = iVar7;
            param_1[1] = (int)piVar5;
            local_50 = puVar3;
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        local_4c = (undefined4 *)((int)puVar3 + iVar2);
        local_48 = puVar3 + (iVar2 >> 1);
        local_50 = puVar3;
      }
      puVar6 = local_4c + 1;
      *local_4c = piVar5;
      uVar4 = (int)puVar6 - (int)local_50 >> 2;
      local_4c = puVar6;
    } while (uVar4 < 2);
    if (uVar4 <= uVar4 - 1 >> 1) {
      *param_1 = iVar7;
      param_1[1] = (int)piVar5;
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00023f10 + 0x23ee2,DAT_00023f14 + 0x23ee4,0x94,DAT_00023f18 + 0x23ee6);
    }
  } while (piVar5 != (int *)local_50[uVar4 - 1 >> 1]);
  *param_1 = iVar7;
  param_1[1] = 0;
LAB_00023ec2:
  FUN_00023f1c(&local_50);
  return;
}


