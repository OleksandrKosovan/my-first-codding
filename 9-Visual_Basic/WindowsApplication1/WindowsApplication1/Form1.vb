﻿Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Label1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Label1.Click

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim a As Double
        Dim b As Double
        Dim c As Double
        a = TextBox1.Text
        b = TextBox2.Text
        c = TextBox3.Text

        TextBox4.Text = a - b * c





    End Sub
End Class
