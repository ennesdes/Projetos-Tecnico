from django import forms
from agendamento.models import Atendimento, Cliente, Funcionario, Servico, Produto, ServicoProduto


class AtendimentoListForm(forms.Form):
    cliente = forms.ModelChoiceField(label='Cliente: ', widget=forms.Select(attrs={'class': 'select is-fullwidth'}),
                                     queryset=Cliente.objects.all(), required=False)
    funcionario = forms.ModelChoiceField(label='Funcionário: ', widget=forms.Select(
        attrs={'class': 'select is-fullwidth'}), queryset=Funcionario.objects.all(), required=False)


class ClienteListForm(forms.Form):
    nome = forms.CharField(label='Nome do(a) cliente(a): ', widget=forms.TextInput(attrs={
        'class': 'input', 'type': 'text', 'placeholder': 'Digite o(a) cliente'}), required=False)


class FuncionarioListForm(forms.Form):
    nome = forms.CharField(label='Nome do(a) funcionário(a): ', widget=forms.TextInput(attrs={
        'class': 'input', 'type': 'text', 'placeholder': 'Digite o(a) funcionário(a)'}), required=False)


class ProdutoListForm(forms.Form):
    nome = forms.CharField(label='Nome do produto: ', widget=forms.TextInput(attrs={
        'class': 'input', 'type': 'text', 'placeholder': 'Digite o produto'}), required=False)


class ServicoListForm(forms.Form):
    nome = forms.CharField(label='Nome do serviço: ', widget=forms.TextInput(attrs={
        'class': 'input', 'type': 'text', 'placeholder': 'Digite o serviço'}), required=False)


class ServicoProdutoListForm(forms.Form):
    servico = forms.ModelChoiceField(label='Serviço: ', widget=forms.Select(attrs={'class': 'select is-fullwidth'}),
                                     queryset=Servico.objects.all(), required=False)
    produto = forms.ModelChoiceField(label='Produto: ', widget=forms.Select(
        attrs={'class': 'select is-fullwidth'}), queryset=Produto.objects.all(), required=False)


class AtendimentoModelForm(forms.ModelForm):
    class Meta:
        model = Atendimento
        fields = '__all__'
        widgets = {
            'cliente': forms.Select(
                attrs={'class': 'input is-primary is-rounded'}),
            'funcionario': forms.Select(
                attrs={'class': 'input is-primary is-rounded'}),
            'data_consulta': forms.DateInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'date',
                       'placeholder': 'Digite a data do atendimento'}),
            'hora_consulta': forms.TimeInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'time',
                       'placeholder': 'Digite a hora do atendimento'}),
            'servico': forms.Select(
                attrs={'class ': 'input is-primary is-rounded'}),
            'situacao': forms.Select(
                attrs={'class ': 'input is-primary is-rounded', 'placeholder': 'Selecione o atendimento'}),
            'observacao': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite a observação'}),
        }


class ClienteModelForm(forms.ModelForm):
    class Meta:
        model = Cliente
        fields = '__all__'
        widgets = {
            'foto': forms.FileInput(attrs={'class': 'input is-primary is-rounded', 'type': 'file'}),
            'nome': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text',
                       'placeholder': 'Digite o nome do(a) cliente'}),
            'telefone': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite o telefone'}),
            'email': forms.EmailInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'email', 'placeholder': 'Digite o email'}),
            'endereco': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite o endereço'}),
        }


class FuncionarioModelForm(forms.ModelForm):
    class Meta:
        model = Funcionario
        fields = '__all__'
        widgets = {
            'foto': forms.FileInput(attrs={'class': 'input is-primary is-rounded', 'type': 'file'}),
            'nome': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text',
                       'placeholder': 'Digite o nome do Funcionário'}),
            'telefone': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite o telefone'}),
            'email': forms.EmailInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'email', 'placeholder': 'Digite o email'}),
            'funcao': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite a função'}),
            'data_admissao': forms.DateInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'date',
                       'placeholder': 'Digite a data de admissão'}),
        }


class ServicoModelForm(forms.ModelForm):
    class Meta:
        model = Servico
        fields = '__all__'
        widgets = {
            'nome': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text',
                       'placeholder': 'Digite o nome do serviço'}),
            'descricao': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite a descrição'}),
            'preco': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite o preço'}),
        }


class ProdutoModelForm(forms.ModelForm):
    class Meta:
        model = Produto
        fields = '__all__'
        widgets = {
            'nome': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text',
                       'placeholder': 'Digite o nome do produto'}),
            'preco': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text', 'placeholder': 'Digite o preço'}),
            'fornecedor': forms.TextInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'text',
                       'placeholder': 'Digite o nome do fornecedor'}),
            'quantidade': forms.NumberInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'number', 'placeholder': 'Digite a quantidade'}),
        }


class ServicoProdutoModelForm(forms.ModelForm):
    class Meta:
        model = ServicoProduto
        fields = '__all__'
        widgets = {
            'servico': forms.Select(
                attrs={'class ': 'input is-primary is-rounded', 'placeholder': 'Selecione o serviço'}),
            'produto': forms.Select(
                attrs={'class': 'input is-primary is-rounded', 'placeholder': 'Selecione o produto'}),
            'quantidade': forms.NumberInput(
                attrs={'class': 'input is-primary is-rounded', 'type': 'number', 'placeholder': 'Digite a quantidade'}),
        }