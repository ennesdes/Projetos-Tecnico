# Generated by Django 4.0.2 on 2022-02-13 19:44

from django.db import migrations, models
import django.db.models.deletion
import stdimage.models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Cliente',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nome', models.CharField(max_length=35, verbose_name='Nome')),
                ('endereco', models.CharField(max_length=100, verbose_name='Endereço')),
                ('telefone', models.CharField(max_length=15, verbose_name='Telefone')),
                ('email', models.CharField(max_length=100, verbose_name='E-mail')),
                ('foto', stdimage.models.StdImageField(blank=True, null=True, upload_to='clientes', verbose_name='Foto')),
            ],
            options={
                'verbose_name': 'Cliente',
                'verbose_name_plural': 'Clientes',
                'ordering': ['nome'],
            },
        ),
        migrations.CreateModel(
            name='Funcionario',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nome', models.CharField(max_length=35, verbose_name='Nome')),
                ('telefone', models.CharField(max_length=14, verbose_name='Telefone')),
                ('email', models.CharField(max_length=100, verbose_name='E-mail')),
                ('funcao', models.CharField(max_length=50, verbose_name='Função')),
                ('data_admissao', models.DateField(blank=True, null=True, verbose_name='Data de admissão')),
                ('foto', stdimage.models.StdImageField(blank=True, null=True, upload_to='funcionarios', verbose_name='Foto')),
            ],
            options={
                'verbose_name': 'Funcionário',
                'verbose_name_plural': 'Funcionários',
                'ordering': ['nome'],
            },
        ),
        migrations.CreateModel(
            name='Produto',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nome', models.CharField(max_length=35, verbose_name='Nome')),
                ('preco', models.CharField(max_length=10, verbose_name='Preço')),
                ('fornecedor', models.CharField(max_length=50, verbose_name='Fornecerdo')),
                ('quantidade', models.IntegerField(verbose_name='Quantidade')),
            ],
            options={
                'verbose_name': 'Produto',
                'verbose_name_plural': 'Produtos',
                'ordering': ['nome'],
            },
        ),
        migrations.CreateModel(
            name='Servico',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nome', models.CharField(max_length=35, verbose_name='Nome')),
                ('descricao', models.CharField(max_length=100, verbose_name='Descrição')),
                ('preco', models.CharField(max_length=10, verbose_name='Preço')),
            ],
            options={
                'verbose_name': 'Serviço',
                'verbose_name_plural': 'Serviços',
                'ordering': ['nome'],
            },
        ),
        migrations.CreateModel(
            name='ServicoProduto',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('quantidade', models.IntegerField(verbose_name='Quantidade de produtos')),
                ('produto', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='agendamento.produto', verbose_name='Produto')),
                ('servico', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='agendamento.servico', verbose_name='Servico')),
            ],
        ),
        migrations.CreateModel(
            name='Atendimento',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('data_consulta', models.DateField(blank=True, null=True, verbose_name='Data da consulta')),
                ('hora_consulta', models.TimeField(blank=True, null=True, verbose_name='Hora da consulta')),
                ('situacao', models.CharField(choices=[('cancelado', 'CANCELADO'), ('realizado', 'REALIZADO'), ('agendado', 'AGENDADO')], default='agendado', max_length=9, verbose_name='Situação')),
                ('observacao', models.CharField(max_length=100, verbose_name='Observação')),
                ('cliente', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='agendamento.cliente', verbose_name='Cliente')),
                ('funcionario', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='agendamento.funcionario', verbose_name='Funcionário')),
                ('servico', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='agendamento.servico', verbose_name='Serviço')),
            ],
            options={
                'verbose_name': 'Consulta',
                'verbose_name_plural': 'Consultas',
                'ordering': ['data_consulta'],
            },
        ),
    ]