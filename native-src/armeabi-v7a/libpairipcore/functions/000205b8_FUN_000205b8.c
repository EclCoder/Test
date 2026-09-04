/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000205b8
 * Address  : 000205b8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000205b8(int *param_1,int param_2)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  
  iVar6 = 0;
  iVar3 = DAT_00020620 + 0x205d2;
  bVar2 = true;
  while (bVar1 = bVar2, iVar6 != param_1[1]) {
    iVar5 = *(int *)(param_2 + 4);
    iVar4 = iVar5;
    if (!bVar1) {
      FUN_0001dcd6(param_2,iVar3,2);
      iVar4 = *(int *)(param_2 + 4);
    }
    FUN_000203bc(*(undefined4 *)(*param_1 + iVar6 * 4),param_2,0x12,0);
    iVar6 = iVar6 + 1;
    bVar2 = false;
    if (iVar4 == *(int *)(param_2 + 4)) {
      *(int *)(param_2 + 4) = iVar5;
      bVar2 = bVar1;
    }
  }
  return;
}


