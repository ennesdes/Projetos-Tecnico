
from django.views.generic import TemplateView, ListView
from django.urls import reverse_lazy
from django.views.generic.edit import CreateView, UpdateView, DeleteView

from .models import Cliente, Funcionario, Produto, Servico, Atendimento, ServicoProduto
from .forms import AtendimentoListForm, ClienteListForm, FuncionarioListForm, ProdutoListForm, ServicoListForm,\
    ServicoProdutoListForm
from .forms import AtendimentoModelForm, ClienteModelForm, FuncionarioModelForm, ProdutoModelForm,\
    ServicoModelForm, ServicoProdutoModelForm
from .utils import HtmlToPdf


class IndexView(TemplateView):
    template_name = 'index.html'


class AtendimentoView(ListView):
    model = Atendimento
    template_name = 'telaAgendamento.html'

    def get_context_data(self, **kwargs):
        context = super(AtendimentoView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = AtendimentoListForm(self.request.GET)
        else:
            form = AtendimentoListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(AtendimentoView, self).get_queryset()

        if self.request.GET:
            form = AtendimentoListForm(self.request.GET)
            if form.is_valid():
                cliente = form.cleaned_data.get('cliente')
                funcionario = form.cleaned_data.get('funcionario')

                if cliente:
                    qs = qs.filter(cliente=cliente)
                if funcionario:
                    qs = qs.filter(funcionario=funcionario)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='agendamento_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(AtendimentoView, self).get(*args, **kwargs)


class AtendimentoAddView(CreateView):
    form_class = AtendimentoModelForm
    model = Atendimento
    template_name = 'agendamento_form.html'
    success_url = reverse_lazy('atendimentos')


class AtendimentoUpDateView(UpdateView):
    form_class = AtendimentoModelForm
    model = Atendimento
    template_name = 'agendamento_form.html'
    success_url = reverse_lazy('atendimentos')


class AtendimentoDeleteView(DeleteView):
    model = Atendimento
    template_name = 'agendamento_apagar.html'
    success_url = reverse_lazy('atendimentos')


class ClientesView(ListView):
    model = Cliente
    template_name = 'telaClientes.html'

    def get_context_data(self, **kwargs):
        context = super(ClientesView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = ClienteListForm(self.request.GET)
        else:
            form = ClienteListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(ClientesView, self).get_queryset()

        if self.request.GET:
            form = ClienteListForm(self.request.GET)
            if form.is_valid():
                nome = form.cleaned_data.get('nome')

                if nome:
                    qs = qs.filter(nome__icontains=nome)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='cliente_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(ClientesView, self).get(*args, **kwargs)


class ClienteAddView(CreateView):
    form_class = ClienteModelForm
    model = Cliente
    template_name = 'cliente_form.html'
    success_url = reverse_lazy('clientes')


class ClienteUpDateView(UpdateView):
    form_class = ClienteModelForm
    model = Cliente
    template_name = 'cliente_form.html'
    success_url = reverse_lazy('clientes')


class ClienteDeleteView(DeleteView):
    model = Cliente
    template_name = 'cliente_apagar.html'
    success_url = reverse_lazy('clientes')


class FuncionariosView(ListView):
    model = Funcionario
    template_name = 'telaFuncionarios.html'

    def get_context_data(self, **kwargs):
        context = super(FuncionariosView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = FuncionarioListForm(self.request.GET)
        else:
            form = FuncionarioListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(FuncionariosView, self).get_queryset()

        if self.request.GET:
            form = FuncionarioListForm(self.request.GET)
            if form.is_valid():
                nome = form.cleaned_data.get('nome')

                if nome:
                    qs = qs.filter(nome__icontains=nome)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='funcionario_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(FuncionariosView, self).get(*args, **kwargs)


class FuncionarioAddView(CreateView):
    form_class = FuncionarioModelForm
    model = Funcionario
    template_name = 'funcionario_form.html'
    success_url = reverse_lazy('funcionarios')


class FuncionarioUpDateView(UpdateView):
    form_class = FuncionarioModelForm
    model = Funcionario
    template_name = 'funcionario_form.html'
    success_url = reverse_lazy('funcionarios')


class FuncionarioDeleteView(DeleteView):
    model = Funcionario
    template_name = 'funcionario_apagar.html'
    success_url = reverse_lazy('funcionarios')


class ProdutosView(ListView):
    model = Produto
    template_name = 'telaProdutos.html'

    def get_context_data(self, **kwargs):
        context = super(ProdutosView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = ProdutoListForm(self.request.GET)
        else:
            form = ProdutoListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(ProdutosView, self).get_queryset()

        if self.request.GET:
            form = ProdutoListForm(self.request.GET)
            if form.is_valid():
                nome = form.cleaned_data.get('nome')

                if nome:
                    qs = qs.filter(nome__icontains=nome)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='produto_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(ProdutosView, self).get(*args, **kwargs)


class ProdutoAddView(CreateView):
    form_class = ProdutoModelForm
    model = Produto
    template_name = 'produto_form.html'
    success_url = reverse_lazy('produtos')


class ProdutoUpDateView(UpdateView):
    form_class = ProdutoModelForm
    model = Produto
    template_name = 'produto_form.html'
    success_url = reverse_lazy('produtos')


class ProdutoDeleteView(DeleteView):
    model = Produto
    template_name = 'produto_apagar.html'
    success_url = reverse_lazy('produtos')


class ServicosView(ListView):
    model = Servico
    template_name = 'telaServicos.html'

    def get_context_data(self, **kwargs):
        context = super(ServicosView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = ServicoListForm(self.request.GET)
        else:
            form = ServicoListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(ServicosView, self).get_queryset()

        if self.request.GET:
            form = ServicoListForm(self.request.GET)
            if form.is_valid():
                nome = form.cleaned_data.get('nome')

                if nome:
                    qs = qs.filter(nome__icontains=nome)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='servico_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(ServicosView, self).get(*args, **kwargs)


class ServicoAddView(CreateView):
    form_class = ServicoModelForm
    model = Servico
    template_name = 'servico_form.html'
    success_url = reverse_lazy('servicos')


class ServicoUpDateView(UpdateView):
    form_class = ServicoModelForm
    model = Servico
    template_name = 'servico_form.html'
    success_url = reverse_lazy('servicos')


class ServicoDeleteView(DeleteView):
    model = Servico
    template_name = 'servico_apagar.html'
    success_url = reverse_lazy('servicos')


class ServicoProdutoView(ListView):
    model = ServicoProduto
    template_name = 'telaServicoProduto.html'

    def get_context_data(self, **kwargs):
        context = super(ServicoProdutoView, self).get_context_data(**kwargs)

        if self.request.GET:
            form = ServicoProdutoListForm(self.request.GET)
        else:
            form = ServicoProdutoListForm()

        context['form'] = form
        return context

    def get_queryset(self):
        qs = super(ServicoProdutoView, self).get_queryset()

        if self.request.GET:
            form = ServicoProdutoListForm(self.request.GET)
            if form.is_valid():
                servico = form.cleaned_data.get('servico')
                produto = form.cleaned_data.get('produto')

                if servico:
                    qs = qs.filter(servico=servico)
                if produto:
                    qs = qs.filter(produto=produto)
        return qs

    def get(self, *args, **kwargs):
        if self.request.GET.get('imprimir') == 'pdf':
            html_pdf = HtmlToPdf(arquivo='servicoProduto_pdf', qs=self.get_queryset())
            return html_pdf.response
        else:
            return super(ServicoProdutoView, self).get(*args, **kwargs)


class ServicoProdutoAddView(CreateView):
    form_class = ServicoProdutoModelForm
    model = ServicoProduto
    template_name = 'servicoProduto_form.html'
    success_url = reverse_lazy('servicoProduto')


class ServicoProdutoUpDateView(UpdateView):
    form_class = ServicoProdutoModelForm
    model = ServicoProduto
    template_name = 'servicoProduto_form.html'
    success_url = reverse_lazy('servicoProduto')


class ServicoProdutoDeleteView(DeleteView):
    model = ServicoProduto
    template_name = 'servicoProduto_apagar.html'
    success_url = reverse_lazy('servicoProduto')
