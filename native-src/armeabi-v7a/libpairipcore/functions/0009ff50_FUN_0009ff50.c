/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009ff50
 * Address  : 0009ff50
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009ff50(int *param_1,int param_2,uint param_3,uint param_4)

{
  int iVar1;
  uint uVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  
  puVar3 = (uint *)(param_2 + 8);
  uVar5 = *puVar3;
  uVar4 = *(uint *)(param_2 + 0xc);
  if ((CARRY4(uVar4,param_4) || CARRY4(uVar4 + param_4,(uint)CARRY4(uVar5,param_3))) ||
     (uVar2 = *(uint *)(param_2 + 0x14),
     (uint)(uVar5 + param_3 <= uVar2) <= -(uVar4 + param_4 + (uint)CARRY4(uVar5,param_3)))) {
    *(undefined2 *)param_1 = 0;
    return;
  }
  if (uVar2 < uVar5) {
                    /* WARNING: Subroutine does not return */
    FUN_00026994(DAT_000a003c + 0xa0038);
  }
  uVar4 = uVar2 - uVar5;
  if (param_3 <= uVar2 - uVar5) {
    uVar4 = param_3;
  }
  if (0xfffffff7 < uVar4) {
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  iVar6 = *(int *)(param_2 + 0x10);
  if (uVar4 < 0xb) {
    iVar1 = (int)param_1 + 1;
    *(char *)param_1 = (char)(uVar4 << 1);
    if (uVar4 == 0) goto LAB_000a000c;
  }
  else {
    iVar1 = FUN_000a0370((uVar4 | 7) + 1);
    param_1[2] = iVar1;
    *param_1 = (uVar4 | 7) + 2;
    param_1[1] = uVar4;
  }
  __aeabi_memmove(iVar1,iVar6 + uVar5,uVar4);
LAB_000a000c:
  *(undefined1 *)(iVar1 + uVar4) = 0;
  uVar4 = *puVar3;
  *puVar3 = uVar4 + param_3;
  *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 0xc) + param_4 + (uint)CARRY4(uVar4,param_3);
  return;
}


